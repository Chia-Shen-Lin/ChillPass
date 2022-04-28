package ManagerApp;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ViewCredentials extends Application implements EventHandler<ActionEvent> {

	Text UserLabel = new Text("Welcome " + MasterAccount.username + "!");
	Text UserID = new Text("User ID: " + MasterAccount.ID);
	Text Intro = new Text("Below are your stored credentials: ");
	Button AddButton = new Button("+");
	Stage View = new Stage();

	public void start(Stage secondaryStage) throws Exception {
		secondaryStage.setTitle(MasterAccount.username + "'s credentials");

		VBox vlayout = new VBox();
		vlayout.setSpacing(5);
		vlayout.setAlignment(Pos.TOP_LEFT);
		AddButton.setShape(new Circle(1.5));
		AddButton.setTranslateY(400);
		AddButton.setTranslateX(235);
		vlayout.getChildren().addAll(UserLabel, UserID, Intro, AddButton);
		Scene scene = new Scene(vlayout, 500, 500);
		secondaryStage.setScene(scene);
		View = secondaryStage;
		secondaryStage.show();

		AddButton.setOnAction(this::handle);

	}

	@Override
	public void handle(ActionEvent event) {
		// TODO Auto-generated method stub
		if (event.getSource() == AddButton) {
			View.close();
			Stage c = new Stage();
			try {
				new AddCredentials().start(c);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);

	}

}
