package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Parent;

public class Scene1Controller {

	@FXML
	private Label validName;

	@FXML
	private TextField nameTextField;

	private Stage stage;
	private Scene scene;
	private Parent root;

	public void switchToScene2(ActionEvent event) throws IOException {

		validName.setText("");
		String name = nameTextField.getText();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene_2.fxml"));
		root = loader.load();
		Scene2Controller s2c = loader.getController();
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

		if (name != "" && name.matches("[a-zA-Z]+")) {
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
			s2c.usersName.setText(name);
		} else {
			validName.setText("Please enter a valid name");
		}

	}
}
