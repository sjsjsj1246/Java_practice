package application.view;

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

import application.MainApp;
import application.model.Repo;
import application.model.Source;

public class RepoTapLayoutController {

	@FXML private Button addRepo;
	@FXML private VBox repoList;
	
	private MainApp mainApp;
	
	public RepoTapLayoutController() {
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
