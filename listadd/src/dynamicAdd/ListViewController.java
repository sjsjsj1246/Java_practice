package dynamicAdd;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class ListViewController implements Initializable {
  
  @FXML private Button BtnAdd;
  @FXML private Button BtnDelete;
  @FXML private ListView<String> listBoxMain;
  @FXML private TextField txtAddItem; 

  private ObservableList<String> listItems;        
  
  // Add event handlers
  @FXML
  private void addAction(ActionEvent action){
    listItems.add(txtAddItem.getText());
    System.out.println("동적 추가");
    txtAddItem.clear();
  }
  
  @FXML
  private void deleteAction(ActionEvent action){
    int selectedItem = listBoxMain.getSelectionModel().getSelectedIndex();
    listItems.remove(selectedItem);
  }
  
  @Override
  public void initialize(URL url, ResourceBundle rb) {
    // TODO
	  listItems = FXCollections.observableArrayList("여기에 추가됨."); 
    listBoxMain.setItems(listItems);
    
    // Disable buttons to start
    BtnAdd.setDisable(true);
    BtnDelete.setDisable(true);

    // Add a ChangeListener to TextField to look for change in focus
    txtAddItem.focusedProperty().addListener(new ChangeListener<Boolean>() {
      public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
        if(txtAddItem.isFocused()){
          BtnAdd.setDisable(false);
        }
     }
    });    

    // Add a ChangeListener to ListView to look for change in focus
    listBoxMain.focusedProperty().addListener(new ChangeListener<Boolean>() {
      public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
        if(listBoxMain.isFocused()){
          BtnDelete.setDisable(false);
        }
     }
    });    
    
  }  
}