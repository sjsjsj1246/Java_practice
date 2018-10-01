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
 * 저장소 모델 클래스
 *
 * @brief 저장소의 정보를 담는 클래스
 */
public class Repo {

    private final StringProperty repoName;
    private final IntegerProperty sourceNum;
    private final ObjectProperty<LocalDate> modifiedDay;
    //저장소 내부의 소스 리스트
  	private ArrayList<Source> sourceData;

    /**
     * 디폴트 생성자
     */
    public Repo() {
        this(null);
    }

    /**
     * 데이터를 초기화하는 생성자
     *
     * @param name
     */
    public Repo(String repoName) {
    	sourceData = new ArrayList<Source> ();
        this.repoName = new SimpleStringProperty(repoName);

        // 테스트를 위해 초기화하는 더미 데이터
        this.sourceNum = new SimpleIntegerProperty(0);
        this.modifiedDay = new SimpleObjectProperty<LocalDate>(LocalDate.of(2018, 8, 20));
        
        //TODO 추후에 DB와 연동해서 소스 추가
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