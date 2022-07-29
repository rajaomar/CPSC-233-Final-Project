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
	private TextField currentweightTextField;

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
	private DatePicker startDate;

	@FXML
	private DatePicker targetDate;

	@FXML
	private Label sceneThreeErrorLabel;

	private Stage stage;
	private Scene scene;
	private VBox root;

	public void switchToScene2(ActionEvent event) throws IOException {

		validName.setText("");
		// usersName.setText(""); fix this
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
					// usersName.setText(name); fix this
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
		AnchorPane root = FXMLLoader.load(getClass().getResource("Scene_4.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

		sceneThreeErrorLabel.setText("");
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

}
