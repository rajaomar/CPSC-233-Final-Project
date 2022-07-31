package application;

import java.io.IOException;

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
	private ChoiceBox<String> genderChoiceBox;

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

	private Stage stage;
	private Scene scene;
	private VBox root;

	public void switchToScene2(ActionEvent event) throws IOException {

		validName.setText("");
		String name = nameTextField.getText();
		AnchorPane root = FXMLLoader.load(getClass().getResource("Scene_2.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		if (name == "" && genderChoiceBox.getValue() == null) {
			errorInputs.setTextFill(Color.color(1, 0, 0));
			errorInputs.setText("Please enter your name and pick a gender");
		} else {
			errorInputs.setText("");
			if (name.matches("[a-zA-Z]+")) {
				if (genderChoiceBox.getValue() != null) {
					scene = new Scene(root);
					stage.setScene(scene);
					stage.show();
				} else {
					validName.setText("");
					validGender.setTextFill(Color.color(1, 0, 0));
					validGender.setText("Please pick a gender");

				}
			} else {
				validGender.setText("");
				validName.setTextFill(Color.color(1, 0, 0));
				validName.setText("Please enter a valid name");
			}

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
		AnchorPane root = FXMLLoader.load(getClass().getResource("Scene_5.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		boolean validCalc = false;

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
														validCalc = true;
														stage.show();
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
												sceneThreeErrorLabel.setText("Please pick your daily activity level");
											}
										} else {
											sceneThreeErrorLabel.setTextFill(Color.color(1, 0, 0));
											sceneThreeErrorLabel
													.setText("You're attempting to lose a lot of bodyweight,"
															+ " please rethink your target weight");
										}
									} else {
										sceneThreeErrorLabel.setTextFill(Color.color(1, 0, 0));
										sceneThreeErrorLabel
												.setText("Please enter the amount of weight you'd like to gain/lose.");
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
			sceneThreeErrorLabel.setText("Please enter all the required details.");
		}

		if (validCalc) {
			doCalc();
		}
	}

	void doCalc() {
		
	}
}
