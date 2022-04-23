package ManagerApp;

import javafx.application.Application;
// import javafx.scene.paint.Color; 
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LoginPage extends Application implements EventHandler<ActionEvent> {

	Text UserLabel = new Text("Username: ");
	TextField UserInput = new TextField();
	Text PassLabel = new Text("Password: ");
	PasswordField PassInput = new PasswordField();
	Button LoginButton = new Button("Login");
	Button ExitButton = new Button("Register/Reset");
	Alert alert = new Alert(AlertType.ERROR);
	Alert success = new Alert(AlertType.INFORMATION);
	Stage first = new Stage();

	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Chillpass - No.1 Password Manager");
		HBox h1 = new HBox();
		HBox h2 = new HBox();
		HBox h3 = new HBox();
		VBox vlayout = new VBox();
		first = primaryStage;

		h1.setSpacing(20);
		h1.setTranslateY(170);
		h2.setSpacing(20);
		h2.setTranslateY(170);
		h3.setSpacing(20);
		h3.setTranslateY(170);
		vlayout.setSpacing(20);
		h1.setAlignment(Pos.CENTER);
		h2.setAlignment(Pos.CENTER);
		h3.setAlignment(Pos.CENTER);
		alert.setTitle(null);
		alert.setHeaderText(null);
		alert.setContentText("Incorrect username or password");
		success.setTitle(null);
		success.setHeaderText(null);
		success.setContentText("Login succeeded!");

		h1.getChildren().addAll(UserLabel, UserInput);
		h2.getChildren().addAll(PassLabel, PassInput);
		h3.getChildren().addAll(LoginButton, ExitButton);

		vlayout.getChildren().addAll(h1, h2, h3);

		Scene scene = new Scene(vlayout, 500, 500);
		primaryStage.setScene(scene);
		primaryStage.show();

		LoginButton.setOnAction(this::handle);
		ExitButton.setOnAction(this::handle);

	}

	@Override
	public void handle(ActionEvent event) {
		// TODO Auto-generated method stub
		if (event.getSource() == LoginButton) {
			String username = UserInput.getText();
			String password = PassInput.getText();
			if (!username.equals(MasterAccount.username) || !password.equals(MasterAccount.password)) {
				alert.showAndWait();
				return;
			} else {
				first.close();
				Stage c = new Stage();
				try {
					new CredentialsPage().start(c);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				// Application.launch(CredentialsPage.class);
				// success.showAndWait();
				// return;
			}

		} else {
			String username = UserInput.getText();
			String password = PassInput.getText();
			if (!username.equals(MasterAccount.username) || !password.equals(MasterAccount.password)) {
				alert.showAndWait();
				return;
			} else {
				first.close();
				Stage c = new Stage();
				try {
					new RegisterPage().start(c);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

	public static void main(String[] args) {
		launch(args);
	}
}
