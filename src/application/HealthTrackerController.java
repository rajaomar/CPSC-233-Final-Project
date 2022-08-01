package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
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
	private TextField weightToChange;

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

	public void switchToScene2(ActionEvent event) throws IOException {

		validName.setText("");
		String name = nameTextField.getText();
		AnchorPane root = FXMLLoader.load(getClass().getResource("Scene_2.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

		if (name != "" && name.matches("[a-zA-Z]+")) {
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
			Label nameLabel = new Label();
			nameLabel.setText(nameTextField.getText());
			nameLabel.setTranslateX(80);
			nameLabel.setTranslateY(20.4);
			nameLabel.setFont(Font.font("System", FontWeight.BOLD, 14));

			root.getChildren().add(nameLabel);
			

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
										if (weightToChange.getText() != ""
												&& (weightToChange.getText().chars().allMatch(Character::isDigit))) {
											int loseWeight = Integer.parseInt(weightToChange.getText());
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

	void doCalc(AnchorPane root, String gender) {
		Label newBmiLabel = new Label();
		newBmiLabel.setTranslateY(73);
		newBmiLabel.setTranslateX(159);
		Label newBmrLabel = new Label();
		newBmrLabel.setTranslateY(92);
		newBmrLabel.setTranslateX(187);
		Label obesityClassLabel = new Label();
		obesityClassLabel.setTranslateY(112);
		obesityClassLabel.setTranslateX(98);
		Label targetCaloriesLabel = new Label();
		targetCaloriesLabel.setTranslateY(190);
		targetCaloriesLabel.setTranslateX(245);
		Label daysNeededLabel = new Label();
		daysNeededLabel.setTranslateX(352.9);
		daysNeededLabel.setTranslateY(250.6);

		Label[] labels = {newBmrLabel, newBmiLabel, obesityClassLabel, targetCaloriesLabel, daysNeededLabel};
		for (Label label : labels)
			root.getChildren().add(label);

		Person user = new Person(genderChoiceBox.getValue(), Integer.parseInt(ageTextField.getText()),
				Integer.parseInt(heightTextField.getText()), Integer.parseInt(currentweightTextField.getText()),
				Double.parseDouble(weeklyWeightChange.getValue()), weightChange.getValue(),
				Integer.parseInt(weightToChange.getText()), activityLevelChoiceBox.getValue());
		newBmrLabel.setText(user.getBmr() + "");
		newBmrLabel.setFont(Font.font("System", FontWeight.BOLD, 14));

		targetCaloriesLabel.setText(user.getDailyIntake() + "");
		targetCaloriesLabel.setTextFill(Color.color(0, 0, 1));
		targetCaloriesLabel.setFont(Font.font("System", FontWeight.BOLD, 14));

		newBmiLabel.setText(String.format("%.1f", user.getBmi()));
		newBmiLabel.setFont(Font.font("System", FontWeight.BOLD, 14));

		daysNeededLabel.setText(user.getDaysNeeded() + "");
		daysNeededLabel.setFont(new Font(14));
		daysNeededLabel.setFont(Font.font("System", FontWeight.BOLD, 14));
		daysNeededLabel.setTextFill(Color.color(0.39, 0.34, 1));

		if (user.getBmi() < 18.5) {
			newBmiLabel.setTextFill(Color.color(1, 0, 0));
			obesityClassLabel.setTextFill(Color.color(1, 0, 0));
			obesityClassLabel.setText("Underweight");
			obesityClassLabel.setFont(Font.font("System", FontWeight.BOLD, 14));

		} else if (user.getBmi() > 18.5 && user.getBmi() < 24.9) {
			newBmiLabel.setTextFill(Color.color(0.5, .8, 0.5));
			obesityClassLabel.setTextFill(Color.color(0.5, .8, 0.5));
			obesityClassLabel.setText("Healthy weight");
			obesityClassLabel.setFont(Font.font("System", FontWeight.BOLD, 14));
		} else if (user.getBmi() > 25.0 && user.getBmi() < 29.9) {
			newBmiLabel.setTextFill(Color.color(1, 0, 0));
			obesityClassLabel.setTextFill(Color.color(1, 0, 0));
			obesityClassLabel.setText("Overweight");
			obesityClassLabel.setFont(Font.font("System", FontWeight.BOLD, 14));

		} else if (user.getBmi() > 30.0) {
			newBmiLabel.setTextFill(Color.color(1, 0, 0));
			obesityClassLabel.setTextFill(Color.color(1, 0, 0));
			obesityClassLabel.setText("Obese");
			obesityClassLabel.setFont(new Font(14));
			obesityClassLabel.setFont(Font.font("System", FontWeight.BOLD, 14));

		}

	}
} 