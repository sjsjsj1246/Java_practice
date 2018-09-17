package application.view;

import java.time.LocalDate;

import application.MainApp;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;;

public class RepoLayoutController {

	@FXML private Label modifiedDay; 
	@FXML private Label repoName;
	@FXML private Label sourceNum;
	@FXML private Button others;
	@FXML private Button goSource;
	@FXML private VBox sourceList;
	
	private ObservableList<SourceLayoutController> sourceLayoutControllerData = FXCollections.observableArrayList();
	
	private MainApp mainApp;
	private int repoIndex;
	
	/**
	 * 생성자
	 */
	public RepoLayoutController() {
	}
	
	/**
	 * 컨트롤러 클래스 초기화
	 */
	@FXML
	private void initialize() {
		// 연락처 테이블 초기화
		
	}
	
	public void setRepoIndex(int index) {
		this.repoIndex = index;
	}
	
	/**
	 * 참조를 유지하기 위해 메인 애플리케이션 호출.
	 * @param mainApp
	 */
	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;
		
	}

	public void setModifiedDay(LocalDate modifiedDay) {
		//this.modifiedDay.setText(modifiedDay.toString());
	}
	
	public void setRepoName(String repoName) {
		this.repoName.setText(repoName);
		
	}

	public void setsourceNum(int sourceNum) {
		this.sourceNum.setText(Integer.toString(sourceNum));
	
	}
	
	public ObservableList<SourceLayoutController> getsourceLayoutControllerData() {
		return sourceLayoutControllerData;
	}
	
	public VBox getSourceList() {
		return sourceList;
	}
	
}
