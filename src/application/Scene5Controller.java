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
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Parent;

public class Scene5Controller {

	@FXML
	private Label sceneFiveErrorLabel;

	@FXML
	public ChoiceBox<Food> breakfastChoicebox;

	@FXML
	public ChoiceBox<Food> lunchChoicebox;

	@FXML
	public ChoiceBox<Food> dinnerChoicebox;

	private Stage stage;
	private Scene scene;
	private Parent root;
	@FXML
	/*Method Name: switchToScene6
	*Inputs: event
	*Functionality: makes it so that after the user inputs from one window it switches to the other
	* and gives out the correct error message 
	*/
	public void switchToScene6(ActionEvent event) throws IOException {
	// Code used for switching scenes:
	// Date accessed Jul 28, 2022
	// https://www.youtube.com/watch?v=hcM-R-YOKkQ
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene_6.fxml"));
		root = loader.load();
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

		if (breakfastChoicebox.getValue() != null && lunchChoicebox.getValue() != null
				&& dinnerChoicebox.getValue() != null) {
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
			//Code used for switching controller:
			//https://www.youtube.com/watch?v=wxhGKR3PQpo
			//Date accessed: August 3rd, 2022
			Scene6Controller.breakfast=breakfastChoicebox.getValue();
			Scene6Controller.lunch=lunchChoicebox.getValue();
			Scene6Controller.dinner=dinnerChoicebox.getValue();
		} else {
			sceneFiveErrorLabel.setText("Please pick a diet type to proceed.");
		}

	}
}
