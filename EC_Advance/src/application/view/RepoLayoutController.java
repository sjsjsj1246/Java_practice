package application.view;

import java.time.LocalDate;
import application.MainApp;
import application.model.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.Button;
import javafx.scene.control.Label;;

public class RepoLayoutController {

	@FXML private Label modifiedDay; 
	@FXML private Label repoName;
	@FXML private Label sourceNum;
	@FXML private Button others;
	@FXML private Button goSource;
	
	private ObservableList<SourceLayoutController> sourceLayoutControllerData = FXCollections.observableArrayList();
	
	private MainApp mainApp;
	private int repoIndex;
	
	/**
	 * ������
	 */
	public RepoLayoutController() {
	}
	
	/**
	 * ��Ʈ�ѷ� Ŭ���� �ʱ�ȭ
	 */
	@FXML
	private void initialize() {
		// ����ó ���̺� �ʱ�ȭ
		
	}
	
	/**
	 * ������ �����ϱ� ���� ���� ���ø����̼� ȣ��.
	 * @param mainApp
	 */
	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;
		
		
	}
	/*
	public void test() {
		repoName.setText(Integer.toString(repoIndex));
	}*/
	
	public ObservableList<SourceLayoutController> getsourceLayoutControllerData() {
		return sourceLayoutControllerData;
	}
}
