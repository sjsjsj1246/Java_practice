package application;

import java.io.IOException;
import java.util.ArrayList;

import application.model.Repo;
import application.model.Source;
import application.model.Version;
import application.view.FriendTapLayoutController;
import application.view.OthersTapLayoutController;
import application.view.RepoLayoutController;
import application.view.RepoTapLayoutController;
import application.view.RootLayoutController;
import application.view.SourceLayoutController;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainApp extends Application {

	@FXML private Stage primaryStage;
	@FXML private VBox rootLayout;
	@FXML private VBox repoTapLayout;
	@FXML private VBox friendTapLayout;
	@FXML private VBox othersTapLayout;
	
	private RepoTapLayoutController repoTapLayoutController;
	
	//����ó�� ���� observable ����Ʈ
	private ObservableList<Repo> repoData = FXCollections.observableArrayList();
	private ArrayList<RepoLayoutController> repoLayoutControllerData;
	
	/**
	 * ������
	 */
	public MainApp() {
		/**
		 * �׽�Ʈ �����͸� �߰��Ѵ�
		 * TODO DB�� ������ ��
		 */
		repoLayoutControllerData = new ArrayList<RepoLayoutController> ();
		
		repoData.add(new Repo("test1"));
		repoData.get(0).getSourceData().add(new Source("test11"));
		repoData.get(0).getSourceData().get(0).getVersionData().add(new Version("Ini"));
		
		repoData.add(new Repo("test2"));
		repoData.get(1).getSourceData().add(new Source("test21"));
		repoData.get(1).getSourceData().get(0).getVersionData().add(new Version("Ini"));
		
		
	}
	
	private void setDataToLayout(ObservableList<Repo> repoData) {
		int repoDataSize = repoData.size();
		for(int i=0; i<repoDataSize; i++) {
			try {
	            FXMLLoader loader = new FXMLLoader();
	            loader.setLocation(MainApp.class.getResource("view/RepoLayout.fxml"));
	            VBox repoLayout = (VBox) loader.load();

	            RepoLayoutController repoLayoutController = loader.getController();
	            repoLayoutController.setRepoIndex(i);
	            repoLayoutControllerData.add(repoLayoutController);
	            //TODO repo �����Ϳ� �ǽð� �����ϵ��� ���α׷��� �� ��
	            //repoLayoutController.setModifiedDay(repoData.get(i).getmodifiedDay());
	            repoLayoutController.setRepoName(repoData.get(i).getRepoName());
	            repoLayoutController.setsourceNum(repoData.get(i).getSourceNum());
	            repoTapLayoutController.addRepoLayout(repoLayout);
	            
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
			
			int sourceSize = repoData.get(i).getSourceData().size();
			for(int j=0; j<sourceSize; j++) {
				try {
					
		            FXMLLoader loader = new FXMLLoader();
		            loader.setLocation(MainApp.class.getResource("view/SourceLayout.fxml"));
		            HBox soucrLayout = (HBox) loader.load();
		            
		            SourceLayoutController sourceLayoutController = loader.getController();
		            sourceLayoutController.setSourceIndex(j);
		            repoLayoutControllerData.get(i).getsourceLayoutControllerData().add(sourceLayoutController);
		            //TODO repo �����Ϳ� �ǽð� �����ϵ��� ���α׷��� �� ��
		            //repoLayoutController.setModifiedDay(repoData.get(i).getmodifiedDay());
		            sourceLayoutController.setSourceName(repoData.get(i).getSourceData().get(j).getName());
		            sourceLayoutController.setMainApp(this);
		            
		           
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
			}
			
		}
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("test");
		this.primaryStage.setResizable(false);
		initLayout();
		setDataToLayout(repoData);
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
            repoTapLayoutController = repoTapLayoutLoader.getController();
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
            
            //fxml ���Ͽ��� ���� ���̾ƿ��� �����´�.
            FXMLLoader versionLayoutLoader = new FXMLLoader();
            versionLayoutLoader.setLocation(MainApp.class.getResource("view/OthersTapLayout.fxml"));
            othersTapLayout = (VBox) versionLayoutLoader.load();
			
            // ���� ���ø����̼��� ��Ÿ �� ��Ʈ�ѷ��� �̿��� �� �ְ� �Ѵ�.
            OthersTapLayoutController versionLayoutController = versionLayoutLoader.getController();
            versionLayoutController.setMainApp(this);
            
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
