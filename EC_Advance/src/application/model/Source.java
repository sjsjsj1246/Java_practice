package application.model;

import java.time.LocalDate;
import java.util.ArrayList;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * �ҽ� �� Ŭ����
 *
 * @brief ������� ������ ��� Ŭ����
 */
public class Source {

    private final StringProperty sourceName;
    private final IntegerProperty verNum;
    private final ObjectProperty<LocalDate> modifiedDay;
    //�ҽ� ������ ���� ����Ʈ
  	private ArrayList<Version> versionData;
  	
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
    public Source(String sourceName) {
    	versionData = new ArrayList<Version> ();
        this.sourceName = new SimpleStringProperty(sourceName);

        // �׽�Ʈ�� ���� �ʱ�ȭ�ϴ� ���� ������
        this.verNum = new SimpleIntegerProperty(0);
        this.modifiedDay = new SimpleObjectProperty<LocalDate>(LocalDate.of(2018, 8, 20));
        
        //TODO ���Ŀ� DB�� �����ؼ� ���� �߰�
        //versionData.add(new Version("test"));
    }

    public String getSourceName() {
        return sourceName.get();
    }

    public void setSourceName(String sourceName) {
        this.sourceName.set(sourceName);
    }

    public StringProperty sourceNameProperty() {
        return sourceName;
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
    public ArrayList<Version> getVersionData() {
    	return versionData;
    }
}