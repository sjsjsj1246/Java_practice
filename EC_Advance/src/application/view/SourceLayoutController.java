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
	 * 생성자
	 */
	public SourceLayoutController() {

	}
	
	/**
	 * 컨트롤러 클래스 초기화
	 */
	@FXML
	private void initialize() {
		// 연락처 테이블 초기화
		
	}
	
	public void setSourceIndex(int index) {
		this.sourceIndex = index;
	}
	
	/**
	 * 참조를 유지하기 위해 메인 애플리케이션 호출.
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
