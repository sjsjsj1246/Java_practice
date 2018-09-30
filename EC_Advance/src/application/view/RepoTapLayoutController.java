package application.view;

import application.MainApp;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;

public class RepoTapLayoutController {

	@FXML private Button addRepo;
	@FXML private VBox nodeList;
	@FXML private VBox nodeParent;
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
    
    /**
     * 
     */
    public void addRepoLayout(VBox repoLayout) {
    	nodeList.getChildren().add(repoLayout);
    }
    
    public void setNodeList(VBox repoLayout) {
    	if(nodeParent.getChildren().size() > 0)
    		nodeParent.getChildren().remove(0);
    	nodeParent.getChildren().add(repoLayout);
    }
    
}
