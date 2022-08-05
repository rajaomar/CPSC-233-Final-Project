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
	public ChoiceBox<String> breakfastChoicebox;

	@FXML
	public ChoiceBox<String> lunchChoicebox;

	@FXML
	public ChoiceBox<String> dinnerChoicebox;

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
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene_6.fxml"));
		root = loader.load();
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

		if (breakfastChoicebox.getValue() != null && lunchChoicebox.getValue() != null
				&& dinnerChoicebox.getValue() != null) {
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
			Scene6Controller.breakfast=breakfastChoicebox.getValue();
			Scene6Controller.lunch=lunchChoicebox.getValue();
			Scene6Controller.dinner=dinnerChoicebox.getValue();
		} else {
			sceneFiveErrorLabel.setText("Please pick a diet type to proceed.");
		}

	}
}
