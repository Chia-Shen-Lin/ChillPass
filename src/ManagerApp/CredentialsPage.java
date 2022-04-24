package ManagerApp;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CredentialsPage extends Application // implements EventHandler<ActionEvent>
{
	Text UserLabel = new Text("Welcome " + MasterAccount.username + "!");
	Text UserID = new Text("User ID: U52960602");
	Text Intro = new Text("Below are your stored credentials: ");

	public void start(Stage secondaryStage) throws Exception {
		secondaryStage.setTitle(MasterAccount.username + "'s credentials");

		VBox vlayout = new VBox();
		vlayout.setSpacing(5);
		vlayout.setAlignment(Pos.TOP_LEFT);
		vlayout.getChildren().addAll(UserLabel, UserID, Intro);
		Scene scene = new Scene(vlayout, 500, 500);
		secondaryStage.setScene(scene);
		secondaryStage.show();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);

	}

}
