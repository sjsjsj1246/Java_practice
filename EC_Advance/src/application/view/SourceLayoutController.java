package application.view;

import java.time.LocalDate;

import application.MainApp;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;;

public class SourceLayoutController {

	@FXML private Label sourceName;
	@FXML private Label modifiedDay;
	@FXML private Button others;
	@FXML private Button goVersion;
	
	private ObservableList<VersionLayoutController> versionLayoutControllerData = FXCollections.observableArrayList();
	
	private MainApp mainApp;
	private int sourceIndex;
	
	/**
	 * ������
	 */
	public SourceLayoutController() {

	}
	
	/**
	 * ��Ʈ�ѷ� Ŭ���� �ʱ�ȭ
	 */
	@FXML
	private void initialize() {
		// ����ó ���̺� �ʱ�ȭ
		
	}
	
	public void setSourceIndex(int index) {
		this.sourceIndex = index;
	}
	
	/**
	 * ������ �����ϱ� ���� ���� ���ø����̼� ȣ��.
	 * @param mainApp
	 */
	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;
	}
	
	public void setModifiedDay(LocalDate modifiedDay) {
		this.modifiedDay.setText(modifiedDay.toString());
	}
	
	public void setSourceName(String repoName) {
		this.sourceName.setText(repoName);
		
	}
	
	public ObservableList<VersionLayoutController> getversionLayoutControllerData() {
		return versionLayoutControllerData;
	}
}
