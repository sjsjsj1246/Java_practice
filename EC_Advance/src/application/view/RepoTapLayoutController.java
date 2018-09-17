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
     * ��Ʈ�ѷ� Ŭ������ �ʱ�ȭ�Ѵ�.
     * fxml ������ �ε�ǰ� ���� �ڵ����� ȣ��ȴ�.
     */
    @FXML
    private void initialize() {
    	
    }
    
	/**
     * ������ �ٽ� �����ϱ� ���� ���� ���ø����̼��� ȣ���Ѵ�.
     *
     * @param mainApp
     */
    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }
    
    public void setChildren(VBox children) {
    	this.children = children;
    }
    
}
