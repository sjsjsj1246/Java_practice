package apllication.view;

import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.layout.VBox;
import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

import apllication.MainApp;
import apllication.model.Repo;
import apllication.model.Source;

public class RepoTapLayoutController {

	@FXML private Button addRepo;
	@FXML private VBox repoList;
	
	private MainApp mainApp;
	
	public RepoTapLayoutController() {
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

        // 테이블에 observable 리스트 데이터를 추가한다.
    }
    
    /**
     * 
     */
    @FXML
    private void add() {
    	try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/RepoLayout.fxml"));
            VBox repo = (VBox) loader.load();

            repoList.getChildren().add(repo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    	
    }
}
