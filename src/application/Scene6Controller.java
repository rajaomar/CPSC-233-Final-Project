package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.scene.Node;

public class Scene6Controller {

	@FXML
	private ChoiceBox<String> timeSpentExercising;

	@FXML
	private ChoiceBox<String> exerciseChoiceBox;

	@FXML
	private Label sceneSixErrorLabel;

	private Stage stage;
	private Scene scene;

	@FXML
	public void switchToScene7(ActionEvent event) throws IOException {
		AnchorPane root = FXMLLoader.load(getClass().getResource("Scene_7.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		if (timeSpentExercising.getValue() != null && exerciseChoiceBox.getValue() != null) {
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} else {
			sceneSixErrorLabel.setText("Please pick both of the options before pressing Next.");
		}
	}
}
