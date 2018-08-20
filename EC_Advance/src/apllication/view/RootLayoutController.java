package apllication.view;

import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import apllication.MainApp;
import apllication.model.Repo;
import apllication.model.Source;

public class RootLayoutController {

	@FXML private Button repoTapButton;
	@FXML private Button friendTapButton;
	@FXML private Button othersTapButton;
	
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

        // ���̺� observable ����Ʈ �����͸� �߰��Ѵ�.
    }
}
