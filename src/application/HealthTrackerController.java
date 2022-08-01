package application;

import java.io.IOException;
import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.Node;

public class HealthTrackerController {

	@FXML
	private TextField nameTextField;

	@FXML
	private Label introductionLabel;

	@FXML
	private TextField ageTextField;

	@FXML
	public TextField currentweightTextField;

	@FXML
	private TextField heightTextField;

	@FXML
	private ChoiceBox<String> activityChoiceBox;

	@FXML
	private Label validName;

	@FXML
	private Label validGender;

	@FXML
	private Label errorInputs;

	@FXML
	public Label usersName;

	@FXML
	private ChoiceBox<String> activityLevelChoiceBox;

	@FXML
	private TextField weightToLose;

	@FXML
	private ChoiceBox<String> weeklyWeightChange;

	@FXML
	private ChoiceBox<String> weightChange;

	@FXML
	private Label sceneThreeErrorLabel;

	@FXML
	private Label bmiLabel;

	@FXML
	private Label bmrLabel;

	@FXML
	private Label obesityClassLabel;

	@FXML
	private Label weightLossDaily;

	@FXML
	public ChoiceBox<String> genderChoiceBox;

	private Stage stage;
	private Scene scene;
	private VBox root;
	private boolean gender = false;

	public void switchToScene2(ActionEvent event) throws IOException {

		validName.setText("");
		String name = nameTextField.getText();
		AnchorPane root = FXMLLoader.load(getClass().getResource("Scene_2.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

		if (name != "" && name.matches("[a-zA-Z]+")) {
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} else {
			errorInputs.setTextFill(Color.color(1, 0, 0));
			errorInputs.setText("Please enter a valid name");
		}

	}

	public void switchToScene3(ActionEvent event) throws IOException {
		AnchorPane root = FXMLLoader.load(getClass().getResource("Scene_3.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	public void switchToScene4(ActionEvent event) throws IOException {
		AnchorPane root = FXMLLoader.load(getClass().getResource("Scene_4.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		boolean validCalc = false;

		if (genderChoiceBox.getValue() != null) {
			if (ageTextField.getText() != "" && (ageTextField.getText().chars().allMatch(Character::isDigit))) {
				int userAge = Integer.parseInt(ageTextField.getText());
				if (userAge > 9) {
					if (userAge < 80) {
						if (heightTextField.getText() != ""
								&& heightTextField.getText().chars().allMatch(Character::isDigit)) {
							int userHeight = Integer.parseInt(heightTextField.getText());
							if (userHeight > 55 && userHeight < 270) {
								if (currentweightTextField.getText() != ""
										&& (currentweightTextField.getText().chars().allMatch(Character::isDigit))) {
									int userWeight = Integer.parseInt(currentweightTextField.getText());
									if (userWeight > 25 && userWeight < 450) {
										if (weightToLose.getText() != ""
												&& (weightToLose.getText().chars().allMatch(Character::isDigit))) {
											int loseWeight = Integer.parseInt(weightToLose.getText());
											if (loseWeight < 0.5 * userWeight) {
												if (activityLevelChoiceBox.getValue() != null) {
													if (weeklyWeightChange.getValue() != null) {
														if (weightChange.getValue() != null) {
															scene = new Scene(root);
															stage.setScene(scene);
															stage.show();
															validCalc = true;
														} else {
															sceneThreeErrorLabel.setTextFill(Color.color(1, 0, 0));
															sceneThreeErrorLabel.setText(
																	"Please pick the correct weight change option (loss/gain)");
														}
													} else {
														sceneThreeErrorLabel.setTextFill(Color.color(1, 0, 0));
														sceneThreeErrorLabel.setText(
																"Please pick one of the weekly weight loss/gain options.");
													}
												} else {
													sceneThreeErrorLabel.setTextFill(Color.color(1, 0, 0));
													sceneThreeErrorLabel
															.setText("Please pick your daily activity level");
												}
											} else {
												sceneThreeErrorLabel.setTextFill(Color.color(1, 0, 0));
												sceneThreeErrorLabel
														.setText("You're attempting to lose a lot of bodyweight,"
																+ " please rethink your target weight");
											}
										} else {
											sceneThreeErrorLabel.setTextFill(Color.color(1, 0, 0));
											sceneThreeErrorLabel.setText(
													"Please enter the amount of weight you'd like to gain/lose.");
										}
									} else {
										sceneThreeErrorLabel.setTextFill(Color.color(1, 0, 0));
										sceneThreeErrorLabel.setText("Please enter a valid weight.");
									}
								} else {
									sceneThreeErrorLabel.setTextFill(Color.color(1, 0, 0));
									sceneThreeErrorLabel.setText("Please enter a valid weight.");
								}
							} else {
								sceneThreeErrorLabel.setTextFill(Color.color(1, 0, 0));
								sceneThreeErrorLabel.setText("Please enter a valid height.");
							}
						} else {
							sceneThreeErrorLabel.setTextFill(Color.color(1, 0, 0));
							sceneThreeErrorLabel.setText("Please enter a valid height.");
						}
					} else {
						sceneThreeErrorLabel.setTextFill(Color.color(1, 0, 0));
						sceneThreeErrorLabel.setText("You're too old to go for weight gain/loss");
					}
				} else {
					sceneThreeErrorLabel.setTextFill(Color.color(1, 0, 0));
					sceneThreeErrorLabel.setText("You're too young to go for weight gain/loss.");
				}
			} else {
				sceneThreeErrorLabel.setTextFill(Color.color(1, 0, 0));
				sceneThreeErrorLabel.setText("Please enter your age.");
			}
		} else {
			sceneThreeErrorLabel.setTextFill(Color.color(1, 0, 0));
			sceneThreeErrorLabel.setText("Please pick your gender.");
		}
		if (validCalc) {
			doCalc(root, genderChoiceBox.getValue());
		}
	}

	int activityLevel(String string) {
		int x = 0;
		if (activityLevelChoiceBox.getValue().equals("Sedentary (little to no exercise + work a desk job)")) {
			x = 1;
		}
		if (activityLevelChoiceBox.getValue().equals("Lightly Active (light exercise 1-3 days / week)")) {
			x = 2;
		}
		if (activityLevelChoiceBox.getValue().equals("Moderately Active (moderate exercise 3-5 days / week)")) {
			x = 3;
		}
		if (activityLevelChoiceBox.getValue().equals("Very Active (heavy exercise 6-7 days / week)")) {
			x = 4;
		}
		if (activityLevelChoiceBox.getValue().equals("Extremely Active (strenuous training 2x / day)")) {
			x = 5;
		}
		return x;
	}

	int gainOrLoss(String string1) {
		int z = 0;
		if (weightChange.getValue().equals("gain"))
			z = 1;
		if (weightChange.getValue().equals("loss"))
			z = 2;
		return z;
	}

	void doCalc(AnchorPane root, String gender) {
		Label newBmiLabel = new Label();
		// newBmiLabel.setText("i am bmi");
		newBmiLabel.setTranslateY(69.5);
		newBmiLabel.setTranslateX(139);
		Label newBmrLabel = new Label();
		// newBmrLabel.setText("i am bmr");
		newBmrLabel.setTranslateY(88);
		newBmrLabel.setTranslateX(161.5);
		Label obesityClassLabel = new Label();
		// obesityClassLabel.setText("i am obesity");
		obesityClassLabel.setTranslateY(104.5);
		obesityClassLabel.setTranslateX(84.8);
		Label targetCaloriesLabel = new Label();
		// targetCaloriesLabel.setText("i am target calories");
		targetCaloriesLabel.setTranslateY(192);
		targetCaloriesLabel.setTranslateX(242);
		Label dailyWeightLoss = new Label();
		// dailyWeightLoss.setText("2.2");
		dailyWeightLoss.setTranslateY(288);
		dailyWeightLoss.setTranslateX(5);
		Label weeklyWeightLoss = new Label();
		// weeklyWeightLoss.setText("1.1");
		weeklyWeightLoss.setTranslateY(305);
		weeklyWeightLoss.setTranslateX(5);
		Label[] labels = { newBmrLabel, newBmiLabel, obesityClassLabel, targetCaloriesLabel, dailyWeightLoss,
				weeklyWeightLoss };
		for (Label label : labels)
			root.getChildren().add(label);
		
		int y = 0;
		if (genderChoiceBox.getValue().equals("male"))
			y = 1;
		if (genderChoiceBox.getValue().equals("female"))
			y = 2;

		Person user = new Person(y, Integer.parseInt(ageTextField.getText()),
				Integer.parseInt(heightTextField.getText()), Integer.parseInt(currentweightTextField.getText()),
				Double.parseDouble(weeklyWeightChange.getValue()), gainOrLoss(weightChange.getValue()),
				Integer.parseInt(weightToLose.getText()), activityLevel(activityLevelChoiceBox.getValue()));
		newBmrLabel.setText(user.getBmr()+"");

	}
}

/**
 * 
 * Person user = new Person(x, Integer.parseInt(ageTextField.getText()),
 * Integer.parseInt(heightTextField.getText()),
 * Integer.parseInt(currentweightTextField.getText()),
 * Double.parseDouble(weeklyWeightChange.getValue()),
 * gainOrLoss(weightChange.getValue()),
 * Integer.parseInt(weightToLose.getText()),
 * activityLevel(activityLevelChoiceBox.getValue()));
 * newBmrLabel.setText(user.getBmr()+"");
 */
/**
 * Person user = new Person(x, Integer.parseInt(ageTextField.getText()),
 * Integer.parseInt(heightTextField.getText()),
 * Integer.parseInt(currentweightTextField.getText()),
 * Double.parseDouble(weeklyWeightChange.getValue()), weightChange.getValue(),
 * Integer.parseInt(weightToLose.getText()), y); System.out.println(user);
 * newBmrLabel.setText(user.getBmr()+"");
 */