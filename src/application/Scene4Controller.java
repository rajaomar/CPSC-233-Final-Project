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

public class Scene4Controller {

	@FXML
	public Label obesityLabelNew;

	@FXML
	public Label requiredDays;

	@FXML
	public Label targetStuff;

	@FXML
	public ChoiceBox<String> dietType;

	@FXML
	public Label sceneFourErrorLabel;

	@FXML
	public Label bmrLabelNew;

	@FXML
	public Label bmiLabelNew;

	private Stage stage;
	private Scene scene;
	private Parent root;

	@FXML
	/*Method Name: switchToScene5
	*Inputs: event
	*Functionality: makes it so that after the user inputs from one window it switches to the other
	* and gives out the correct error message 
	*/
	public void switchToScene5(ActionEvent event) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene_5.fxml"));
		root = loader.load();
		Scene5Controller s5c = loader.getController();

		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		if (dietType.getValue() != null) {
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
			addFoodOptions(s5c);
		} else {

			sceneFourErrorLabel.setText("Please pick a diet type to proceed.");
		}
	}
	/*Method Name: addFoodOptions
	*Inputs: s5c
	*Functionality: sets the choicebox of the breakfast,lunch and dinners to the user 
	*and adds all the correct food choices
	*/
	void addFoodOptions(Scene5Controller s5c) {
		FoodOptions usersFoodPreferance = new FoodOptions(dietType.getValue());

		s5c.breakfastChoicebox.getItems().addAll(usersFoodPreferance.getBreakfast1(),
				usersFoodPreferance.getBreakfast2(), usersFoodPreferance.getBreakfast3());
		s5c.lunchChoicebox.getItems().addAll(usersFoodPreferance.getLunch1(), usersFoodPreferance.getLunch2(),
				usersFoodPreferance.getLunch3());
		s5c.dinnerChoicebox.getItems().addAll(usersFoodPreferance.getDinner1(), usersFoodPreferance.getDinner2(),
				usersFoodPreferance.getDinner3());
	}
}