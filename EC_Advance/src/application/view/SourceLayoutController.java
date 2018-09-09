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

public class SourceLayoutController {

	@FXML private Label modifiedDay; 
	@FXML private Label repoName;
	@FXML private Label sourceNum;
	@FXML private Button others;
	@FXML private Button goSource;
	
	private ObservableList<VersionLayoutController> versionLayoutControllerData = FXCollections.observableArrayList();
	
	private MainApp mainApp;
	private int sourceIndex;
	
	/**
	 * ������
	 */
	public SourceLayoutController(int n) {
		sourceIndex = n;
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
	
	public ObservableList<VersionLayoutController> getversionLayoutControllerData() {
		return versionLayoutControllerData;
	}
}
