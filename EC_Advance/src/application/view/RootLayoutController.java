package application.view;

import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;

import java.io.IOException;

import application.MainApp;
import application.model.Repo;
import application.model.Source;

public class RootLayoutController {

	@FXML private Button repoTapButton;
	@FXML private Button friendTapButton;
	@FXML private Button othersTapButton;
	@FXML private VBox rootLayout;
	
	private MainApp mainApp;
	private RepoTapLayoutController repoTapLayoutController = new RepoTapLayoutController();
	
	public RootLayoutController() {
	}
	
	/**
     * 컨트롤러 클래스를 초기화한다.
     * fxml 파일이 로드되고 나서 자동으로 호출된다.
     */
    @FXML
    private void initialize() {
    	
    }
    
	/**
     * 참조를 다시 유지하기 위해 메인 애플리케이션이 호출한다.
     *
     * @param mainApp
     */
    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }
    
    
    /**
     * 버튼을 누르면 탭을 보여준다.
     */
    @FXML public void showRepoTapLayout() { mainApp.showRepoTapLayout(); }
    
    @FXML public void showfriendTapLayout() { mainApp.showFriendTapLayout(); }
    
    @FXML public void showOthersTapLayout() { mainApp.showOthersTapLayout(); }
}
