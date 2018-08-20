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
	
	//연락처에 대한 observable 리스트
	private ObservableList<Repo> repoData = FXCollections.observableArrayList();
	
	/**
	 * 생성자
	 */
	public MainApp() {
		/**
		 * 테스트 데이터를 추가한다
		 * TODO DB와 연동할 것
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
     * 상위 레이아웃을 초기화한다.
     */
	public void initRootLayout() {
		try {
			// fxml 파일에서 상위 레이아웃을 가져온다.
			FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/RootLayout.fxml"));
            rootLayout = (VBox) loader.load();
			
			// 상위 레이아웃을 포함하는 scene을 보여준다.
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
			
			// 메인 애플리케이션이 컨트롤러를 이용할 수 있게 한다.
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
	 * 저장소에 대한 observable 리스트를 반환한다.
	 * @return
	 */
	public ObservableList<Repo> getRepoData(){
		return repoData;
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
