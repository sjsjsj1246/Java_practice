package application.view;

import java.time.LocalDate;
import application.MainApp;
import application.model.*;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.Button;

public class VersionLayoutController {

	@FXML private TableView<Version> versionTable;
	@FXML private TableColumn<Version, String> versionNameColumn;
	@FXML private TableColumn<Version, String> authorColumn;
	@FXML private TableColumn<Version, LocalDate> modifiedDayColumn;
	
	@FXML private Button download;
	@FXML private Button modifiy;
	@FXML private Button delete;
	@FXML private Button add;
	
	private MainApp mainApp;
	
	/**
	 * ������
	 */
	public VersionLayoutController() {
		
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
}
