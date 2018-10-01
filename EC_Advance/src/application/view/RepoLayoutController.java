package application.view;

import java.time.LocalDate;
import java.util.ArrayList;

import application.MainApp;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class RepoLayoutController {

	@FXML private Label modifiedDay; 
	@FXML private Label repoName;
	@FXML private Label sourceNum;
	@FXML private Button others;
	@FXML private Button goSource;
	@FXML private VBox sourceList;
	
	private ArrayList<SourceLayoutController> sourceLayoutControllerData;
	
	private MainApp mainApp;
	private int repoIndex;
	
	/**
	 * 생성자
	 */
	public RepoLayoutController() {
		sourceLayoutControllerData = new ArrayList<SourceLayoutController> ();
		sourceList = new VBox();
		sourceList.setPadding(new Insets(20,0,20,0));
		sourceList.setSpacing(20);
		sourceList.setPrefWidth(300);
		sourceList.setPrefHeight(520);
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
		this.modifiedDay.setText(modifiedDay.toString());
	}
	
	public void setRepoName(String repoName) {
		this.repoName.setText(repoName);
		
	}

	public void setsourceNum(int sourceNum) {
		this.sourceNum.setText(Integer.toString(sourceNum));
	
	}
	
	public ArrayList<SourceLayoutController> getsourceLayoutControllerData() {
		return sourceLayoutControllerData;
	}
	
	public VBox getSourceList() {
		return sourceList;
	}
	
	public void showSourceList() {
		mainApp.getRepoTapLayoutController().setNodeList(sourceList);
	}
}
