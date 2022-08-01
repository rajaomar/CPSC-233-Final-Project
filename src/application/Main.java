package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;


public class Main extends Application {

	@Override
	public void start(Stage primaryStage) {
		try {
			
			AnchorPane root = FXMLLoader.load(getClass().getResource("Scene_1.fxml"));		
			Scene scene = new Scene(root,500,500);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Health Tracker");
			primaryStage.show();
			Person test = new Person("male", 19, 175, 75, 0.25, "gain", 10,"Sedentary (little to no exercise + work a desk job)");
			System.out.println(test.toString());
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
		
	}
}