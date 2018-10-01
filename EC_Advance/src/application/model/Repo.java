package application.model;

import java.time.LocalDate;
import java.util.ArrayList;

import application.view.RepoLayoutController;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * ����� �� Ŭ����
 *
 * @brief ������� ������ ��� Ŭ����
 */
public class Repo {

    private final StringProperty repoName;
    private final IntegerProperty sourceNum;
    private final ObjectProperty<LocalDate> modifiedDay;
    //����� ������ �ҽ� ����Ʈ
  	private ArrayList<Source> sourceData;

    /**
     * ����Ʈ ������
     */
    public Repo() {
        this(null);
    }

    /**
     * �����͸� �ʱ�ȭ�ϴ� ������
     *
     * @param name
     */
    public Repo(String repoName) {
    	sourceData = new ArrayList<Source> ();
        this.repoName = new SimpleStringProperty(repoName);

        // �׽�Ʈ�� ���� �ʱ�ȭ�ϴ� ���� ������
        this.sourceNum = new SimpleIntegerProperty(0);
        this.modifiedDay = new SimpleObjectProperty<LocalDate>(LocalDate.of(2018, 8, 20));
        
        //TODO ���Ŀ� DB�� �����ؼ� �ҽ� �߰�
        //sourceData.add(new Source("test"));
    }

    public String getRepoName() {
        return repoName.get();
    }

    public void setRepoame(String name) {
        this.repoName.set(name);
    }

    public StringProperty repoNameProperty() {
        return repoName;
    }
    
    public int getSourceNum() {
        return sourceNum.get();
    }

    public void setSourceNum(int sourceNum) {
        this.sourceNum.set(sourceNum);
    }

    public IntegerProperty sourceNumProperty() {
        return sourceNum;
    }

    public LocalDate getmodifiedDay() {
        return modifiedDay.get();
    }

    public void setmodifiedDay(LocalDate modifiedDay) {
        this.modifiedDay.set(modifiedDay);
    }

    public ObjectProperty<LocalDate> modifiedDayProperty() {
        return modifiedDay;
    }
    
    public ArrayList<Source> getSourceData() {
    	return sourceData;
    }
}