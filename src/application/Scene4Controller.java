package application;

import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
	/*
	 * Method Name: switchToScene5 Inputs: event Functionality: makes it so that
	 * after the user inputs from one window it switches to the other and gives out
	 * the correct error message
	 */
	public void switchToScene5(ActionEvent event) throws IOException {
		// Code used for switching scenes:
		// Date accessed Jul 28, 2022
		// https://www.youtube.com/watch?v=hcM-R-YOKkQ
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene_5.fxml"));
		root = loader.load();
		// Code used for switching controller:
		// https://www.youtube.com/watch?v=wxhGKR3PQpo
		// Date accessed: August 3rd, 2022
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

	/*
	 * Method Name: addFoodOptions Inputs: s5c Functionality: sets the choicebox of
	 * the breakfast,lunch and dinners to the user and adds all the correct food
	 * choices
	 */
	void addFoodOptions(Scene5Controller s5c) {
		// FoodOptions usersFoodPreferance = new FoodOptions(dietType.getValue());
		ObservableList<Food> breakfastList = FXCollections.observableArrayList();
		ObservableList<Food> lunchList = FXCollections.observableArrayList();
		ObservableList<Food> dinnerList = FXCollections.observableArrayList();

		String usersDietType = dietType.getValue();
		s5c.breakfastChoicebox.setItems(breakfastList);
		s5c.lunchChoicebox.setItems(lunchList);
		s5c.dinnerChoicebox.setItems(dinnerList);
		if (dietType.getValue().equals("Regular")) {
			breakfastList.addAll(new BreakfastOne(), new BreakfastTwo(), new BreakfastThree());
			lunchList.addAll(new LunchOne(), new LunchTwo(), new LunchThree());
			dinnerList.addAll(new DinnerOne(), new DinnerTwo(), new DinnerThree());
		} else if (dietType.getValue().equals("Vegetarian")) {
			breakfastList.addAll(new BreakfastFour(), new BreakfastFive(), new BreakfastSix());
			lunchList.addAll(new LunchFour(), new LunchFive(), new LunchSix());
			dinnerList.addAll(new DinnerFour(), new DinnerFive(), new DinnerSix());
		} else if (dietType.getValue().equals("Vegan")) {
			breakfastList.addAll(new BreakfastSeven(), new BreakfastEight(), new BreakfastNine());
			lunchList.addAll(new LunchSeven(), new LunchEight(), new LunchNine());
			dinnerList.addAll(new DinnerSeven(), new DinnerEight(), new DinnerNine());
		}
	}

}
