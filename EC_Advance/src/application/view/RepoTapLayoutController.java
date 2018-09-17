package application.view;

import application.MainApp;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class RepoTapLayoutController {

	@FXML private Button addRepo;
	@FXML private VBox children;
	
	private MainApp mainApp;
	
	public RepoTapLayoutController() {
	}
	
	/**
     * 컨트롤러 클래스를 초기화한다.
     * fxml 파일이 로드되고 나서 자동으로 호출된다.
     */
    @FXML
    private void initialize() {
    	
    }
    
	/**
     * 참조를 다시 유지하기 위해 메인 애플리케이션이 호출한다.
     *
     * @param mainApp
     */
    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }
    
    public void addRepoLayout(VBox repoLayout) {
    	this.children;
    }
 
    public VBox getChildren() {
    	return children;
    }
}
