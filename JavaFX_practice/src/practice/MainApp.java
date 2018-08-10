package practice;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainApp extends Application {

	private Stage primaryStage;
	private AnchorPane rootLayout;
	
	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("PracticeApp");
		
		initRootLayout();
		
		showRepositoryOverview();
	}
	
	/**
	 * ���� ���̾ƿ��� �ʱ�ȭ�Ѵ�.
	 */
	public void initRootLayout() {
		try {
			//fxml ���Ͽ��� ���� ���̾ƿ��� �����´�.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("view/RootLayout.fxml"));
			rootLayout = (AnchorPane) loader.load();
			
			
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * ���� ���̾ƿ� �ȿ� RepositoryOverview�� �����ش�.
	 */
	public void showRepositoryOverview() {
		try {
			//����� ���̾ƿ��� �����´�.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("view/RepositoryOverview"));
			AnchorPane repositortOverview = (AnchorPane) loader.load();
			
			//����Ҹ� ���� ���̾ƿ��� ����
			rootLayout.setClip(repositortOverview);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
     * ���� ���������� ��ȯ�Ѵ�.
     * @return
     */
    public Stage getPrimaryStage() {
        return primaryStage;
    }
	
	public static void main(String[] args) {
		launch(args);
	}
}
