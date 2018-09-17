package application.view;

import application.MainApp;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class RootLayoutController {

	@FXML private Button repoTapButton;
	@FXML private Button friendTapButton;
	@FXML private Button othersTapButton;
	@FXML private VBox rootLayout;
	
	private MainApp mainApp;
	
	public RootLayoutController() {
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
     * ��ư�� ������ ���� �����ش�.
     */
    @FXML public void showRepoTapLayout() { mainApp.showRepoTapLayout(); }
    
    @FXML public void showfriendTapLayout() { mainApp.showFriendTapLayout(); }
    
    @FXML public void showOthersTapLayout() { mainApp.showOthersTapLayout(); }
}
