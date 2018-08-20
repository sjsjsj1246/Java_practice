package apllication;

import java.io.IOException;

import apllication.model.Repo;
import apllication.model.Source;
import apllication.view.RootLayoutController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class MainApp extends Application {

	private Stage primaryStage;
	private VBox rootLayout;
	
	//����ó�� ���� observable ����Ʈ
	private ObservableList<Repo> repoData = FXCollections.observableArrayList();
	
	/**
	 * ������
	 */
	public MainApp() {
		/**
		 * �׽�Ʈ �����͸� �߰��Ѵ�
		 * TODO DB�� ������ ��
		 */
		repoData.add(new Repo("test"));
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("test");
		this.primaryStage.setResizable(false);
		
		initRootLayout();
		showRepoTapLayout();
	}

	 /**
     * ���� ���̾ƿ��� �ʱ�ȭ�Ѵ�.
     */
	public void initRootLayout() {
		try {
			// fxml ���Ͽ��� ���� ���̾ƿ��� �����´�.
			FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/RootLayout.fxml"));
            rootLayout = (VBox) loader.load();
			
			// ���� ���̾ƿ��� �����ϴ� scene�� �����ش�.
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
			
			// ���� ���ø����̼��� ��Ʈ�ѷ��� �̿��� �� �ְ� �Ѵ�.
			//RootLayoutController controller = loader.getController();
			//controller.setMainApp(this);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void showRepoTapLayout() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("view/RepoTapLayout.fxml"));
            VBox RepoTapLayout = (VBox) loader.load();
			
			rootLayout.getChildren().add(RepoTapLayout);
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * ����ҿ� ���� observable ����Ʈ�� ��ȯ�Ѵ�.
	 * @return
	 */
	public ObservableList<Repo> getRepoData(){
		return repoData;
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
