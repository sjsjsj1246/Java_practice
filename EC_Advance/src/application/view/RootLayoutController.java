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
     * ��Ʈ�ѷ� Ŭ������ �ʱ�ȭ�Ѵ�.
     * fxml ������ �ε�ǰ� ���� �ڵ����� ȣ��ȴ�.
     */
    @FXML
    private void initialize() {
    	
    }
    
	/**
     * ������ �ٽ� �����ϱ� ���� ���� ���ø����̼��� ȣ���Ѵ�.
     *
     * @param mainApp
     */
    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }
    
    
    /**
     * ��ư�� ������ ���� �����ش�.
     */
    @FXML public void showRepoTapLayout() { mainApp.showRepoTapLayout(); }
    
    @FXML public void showfriendTapLayout() { mainApp.showFriendTapLayout(); }
    
    @FXML public void showOthersTapLayout() { mainApp.showOthersTapLayout(); }
}
