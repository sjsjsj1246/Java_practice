package test;

import java.io.IOException;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.layout.VBox;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

public class Main extends Application {

	private Stage primaryStage;
	private VBox rootLayout;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("test");
		
		initRootLayout();
		showPersonOverview();
	}
	
	public void initRootLayout() {
		try {
			rootLayout = FXMLLoader.load(getClass().getResource("root.fxml"));
			
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void showPersonOverview() {
		try {
			VBox list = FXMLLoader.load(getClass().getResource("list.fxml"));
			
			rootLayout.getChildren().add(list);
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
