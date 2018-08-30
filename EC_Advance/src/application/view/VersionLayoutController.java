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
	 * 생성자
	 */
	public VersionLayoutController() {
		
	}
	
	/**
	 * 컨트롤러 클래스 초기화
	 */
	@FXML
	private void initialize() {
		// 연락처 테이블 초기화
	}
	
	/**
	 * 참조를 유지하기 위해 메인 애플리케이션 호출.
	 * @param mainApp
	 */
	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;
		
		
	}
}
