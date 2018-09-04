package application.model;

import java.time.LocalDate;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * �ҽ� �� Ŭ����
 *
 * @brief ������� ������ ��� Ŭ����
 */
public class Source {

    private final StringProperty name;
    private final IntegerProperty verNum;
    private final ObjectProperty<LocalDate> modifiedDay;
    //�ҽ� ������ ���� ����Ʈ
  	private ObservableList<Version> versionData = FXCollections.observableArrayList();
  	
    /**
     * ����Ʈ ������
     */
    public Source() {
        this(null);
    }

    /**
     * �����͸� �ʱ�ȭ�ϴ� ������
     *
     * @param name
     */
    public Source(String name) {
        this.name = new SimpleStringProperty(name);

        // �׽�Ʈ�� ���� �ʱ�ȭ�ϴ� ���� ������
        this.verNum = new SimpleIntegerProperty(0);
        this.modifiedDay = new SimpleObjectProperty<LocalDate>(LocalDate.of(2018, 8, 20));
        
        //TODO ���Ŀ� DB�� �����ؼ� ���� �߰�
        versionData.add(new Version("test"));
    }

    public String getName() {
        return name.get();
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public StringProperty nameProperty() {
        return name;
    }
    
    public int getVerNum() {
        return verNum.get();
    }

    public void setVerNum(int sourceNum) {
        this.verNum.set(sourceNum);
    }

    public IntegerProperty verNumProperty() {
        return verNum;
    }

    public LocalDate getModifiedDay() {
        return modifiedDay.get();
    }

    public void setModifiedDay(LocalDate birthday) {
        this.modifiedDay.set(birthday);
    }

    public ObjectProperty<LocalDate> modifiedDayProperty() {
        return modifiedDay;
    }
}