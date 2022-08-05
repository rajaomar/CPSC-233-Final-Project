package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
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

	public static int weight;
	public static String breakfast;
	public static String lunch;
	public static String dinner;
	public static int recommendedIntake;

	private Stage stage;
	private Scene scene;
	private Parent root;

	@FXML
	public void switchToScene7(ActionEvent event) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene_7.fxml"));
		root = loader.load();

		Scene7Controller s7c = loader.getController();

		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		if (timeSpentExercising.getValue() != null && exerciseChoiceBox.getValue() != null) {
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
			setCalorieLabels(s7c);
			setMacrosLabels(s7c);
		} else {
			sceneSixErrorLabel.setText("Please pick both of the options before pressing Next.");
		}
	}

	void setCalorieLabels(Scene7Controller s7c) {
		Exercise usersExercise = new Exercise(exerciseChoiceBox.getValue(),
				Integer.parseInt(timeSpentExercising.getValue()), weight);
		usersExercise.getCaloriesBurnt();

		Nutrients usersFood = new Nutrients(breakfast, lunch, dinner);
		int netCalories = usersFood.getTotalCalories() - usersExercise.getCaloriesBurnt();

		s7c.netCaloricIntake.setText(netCalories + "");
		if (recommendedIntake < netCalories) {
			s7c.caloricDiff.setText("more");
			s7c.caloricDiff.setFont(Font.font("System", FontWeight.BOLD, 14));
		}
		if (recommendedIntake > netCalories) {
			s7c.caloricDiff.setText("less");
			s7c.caloricDiff.setFont(Font.font("System", FontWeight.BOLD, 14));
		} else
			s7c.caloricDiff.setText("equal");

	}

	void setMacrosLabels(Scene7Controller s7c) {

		s7c.proteinLabel.setText(String.format("%.1f", (recommendedIntake * 0.4) / 4) + " grams");
		s7c.carbsLabel.setText(String.format("%.1f", (recommendedIntake * 0.3) / 4) + " grams");
		s7c.fatsLabel.setText(String.format("%.1f", (recommendedIntake * 0.4) / 9) + " grams");

	}
}
