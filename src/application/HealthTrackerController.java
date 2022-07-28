package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
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
	 
    
	private Stage stage;
	private Scene scene;
	private VBox root;
	
	public void switchToScene2(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("Scene_2.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchToScene3(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("Scene_3.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();	
		}
	
	public void switchToScene4(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("Scene_4.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();		
		}
	
	public void switchToScene5(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("Scene_5.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();		
		}
}
