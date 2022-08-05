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
import javafx.scene.Parent;

public class Scene6Controller {

	@FXML
	private ChoiceBox<String> timeSpentExercising;

	@FXML
	private ChoiceBox<String> exerciseChoiceBox;

	@FXML
	private Label sceneSixErrorLabel;

	private Stage stage;
	private Scene scene;
	private Parent root;

	@FXML
	/*Method Name: switchToScene7
	*Inputs: event
	*Functionality: makes it so that after the user inputs from one window it switches to the other
	* and gives out the correct error message 
	*/
	public void switchToScene7(ActionEvent event) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene_7.fxml"));
		root = loader.load();
	//	Scene7Controller s7c = loader.getController();
	//	Scene5Controller s5c = loader.getController();
	//	Scene3Controller s3c = loader.getController();

		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		if (timeSpentExercising.getValue() != null && exerciseChoiceBox.getValue() != null) {
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();

		//	s7c.netCaloricIntake.setText();

		} else {
			sceneSixErrorLabel.setText("Please pick both of the options before pressing Next.");
		}
	}

//	void setLabelText(Scene7Controller s7c, Scene5Controller s5c, Scene3Controller s3c) {
	//	Exercise usersExercise = new Exercise(exerciseChoiceBox.getValue(),
		//		Integer.parseInt(timeSpentExercising.getValue()),
		//		Integer.parseInt(s3c.currentweightTextField.getText()));
		
	//	usersExercise.getCaloriesBurnt()+
		
	//	s7c.netCaloricIntake.setText(null);

	}
