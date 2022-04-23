package ManagerApp;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class RegisterPage extends Application // implements EventHandler<ActionEvent>
{

	public void start(Stage RStage) throws Exception {
		Button b = new Button("CredentialsPage");
		// HBox h1 = new HBox();
		Scene scene = new Scene(b, 500, 500);
		RStage.setScene(scene);
		RStage.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);

	}

}
