package apllication;

import java.io.IOException;

import apllication.model.Repo;
import apllication.model.Source;
import apllication.view.*;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class MainApp extends Application {

	@FXML private Stage primaryStage;
	@FXML private VBox rootLayout;
	@FXML private VBox repoTapLayout;
	@FXML private VBox friendTapLayout;
	@FXML private VBox othersTapLayout;
	
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
		
		initLayout();
		showRepoTapLayout();
	}

	/**
	 * ���� ���̾ƿ��� �ʱ�ȭ�Ѵ�.
	 */
	@FXML public void initLayout() {
		try {
			// fxml ���Ͽ��� ��Ʈ ���̾ƿ��� �����´�.
			FXMLLoader rootLayoutLoader = new FXMLLoader();
			rootLayoutLoader.setLocation(MainApp.class.getResource("view/RootLayout.fxml"));
            rootLayout = (VBox) rootLayoutLoader.load();
			
			// ���� ���ø����̼��� ��Ʈ ��Ʈ�ѷ��� �̿��� �� �ְ� �Ѵ�.
            RootLayoutController rootLayoutController = rootLayoutLoader.getController();
            rootLayoutController.setMainApp(this);

            
            //fxml ���Ͽ��� ����� �� ���̾ƿ��� �����´�.
            FXMLLoader repoTapLayoutLoader = new FXMLLoader();
            repoTapLayoutLoader.setLocation(MainApp.class.getResource("view/RepoTapLayout.fxml"));
            repoTapLayout = (VBox) repoTapLayoutLoader.load();
			
			// ���� ���ø����̼��� ����� �� ��Ʈ�ѷ��� �̿��� �� �ְ� �Ѵ�.
            RepoTapLayoutController repoTapLayoutController = repoTapLayoutLoader.getController();
            repoTapLayoutController.setMainApp(this);
            
            
            //fxml ���Ͽ��� ģ�� �� ���̾ƿ��� �����´�.
            FXMLLoader friendTapLayoutLoader = new FXMLLoader();
            friendTapLayoutLoader.setLocation(MainApp.class.getResource("view/FriendTapLayout.fxml"));
            friendTapLayout = (VBox) friendTapLayoutLoader.load();
			
			// ���� ���ø����̼��� ģ�� �� ��Ʈ�ѷ��� �̿��� �� �ְ� �Ѵ�.
            FriendTapLayoutController friendTapLayoutController = friendTapLayoutLoader.getController();
            friendTapLayoutController.setMainApp(this);
            
            
            //fxml ���Ͽ��� ��Ÿ �� ���̾ƿ��� �����´�.
            FXMLLoader othersTapLayoutLoader = new FXMLLoader();
            othersTapLayoutLoader.setLocation(MainApp.class.getResource("view/OthersTapLayout.fxml"));
            othersTapLayout = (VBox) othersTapLayoutLoader.load();
			
            // ���� ���ø����̼��� ��Ÿ �� ��Ʈ�ѷ��� �̿��� �� �ְ� �Ѵ�.
            OthersTapLayoutController othersTapLayoutController = othersTapLayoutLoader.getController();
            othersTapLayoutController.setMainApp(this);
            
            // ���� ���̾ƿ��� �����ϴ� scene�� �����ش�.
         	Scene scene = new Scene(rootLayout);
         	primaryStage.setScene(scene);
         	primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * rootLayout�� tapLayout�� �߰��Ѵ�.
	 */
	@FXML public void showRepoTapLayout() {
		if(rootLayout.getChildren().size() > 1)
    		rootLayout.getChildren().remove(1);
		rootLayout.getChildren().add(repoTapLayout);
	}
	
	@FXML public void showFriendTapLayout() {
		if(rootLayout.getChildren().size() > 1)
    		rootLayout.getChildren().remove(1);
		rootLayout.getChildren().add(friendTapLayout);
	}
	
	@FXML public void showOthersTapLayout() {
		if(rootLayout.getChildren().size() > 1)
    		rootLayout.getChildren().remove(1);
		rootLayout.getChildren().add(othersTapLayout);
	}
	
	@FXML public VBox getRepoTapLayout() { return repoTapLayout; }
	
	@FXML public VBox getFriendTapLayout() { return friendTapLayout; }
	
	@FXML public VBox getOthersTapLayout() { return othersTapLayout; }
	
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
