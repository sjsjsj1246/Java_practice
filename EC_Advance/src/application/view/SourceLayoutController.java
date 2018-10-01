package application.view;

import java.time.LocalDate;
import java.util.ArrayList;

import application.MainApp;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;;

public class SourceLayoutController {

	@FXML private Label sourceName;
	@FXML private Label modifiedDay;
	@FXML private Button others;
	@FXML private Button goVersion;
	
	private ArrayList<VersionLayoutController> versionLayoutControllerData;
	
	private MainApp mainApp;
	private int sourceIndex;
	
	/**
	 * ������
	 */
	public SourceLayoutController() {
		versionLayoutControllerData = new ArrayList<VersionLayoutController> ();
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
	
	public ArrayList<VersionLayoutController> getversionLayoutControllerData() {
		return versionLayoutControllerData;
	}
}
