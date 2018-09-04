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
 * 소스 모델 클래스
 *
 * @brief 저장소의 정보를 담는 클래스
 */
public class Source {

    private final StringProperty name;
    private final IntegerProperty verNum;
    private final ObjectProperty<LocalDate> modifiedDay;
    //소스 내부의 버전 리스트
  	private ObservableList<Version> versionData = FXCollections.observableArrayList();
  	
    /**
     * 디폴트 생성자
     */
    public Source() {
        this(null);
    }

    /**
     * 데이터를 초기화하는 생성자
     *
     * @param name
     */
    public Source(String name) {
        this.name = new SimpleStringProperty(name);

        // 테스트를 위해 초기화하는 더미 데이터
        this.verNum = new SimpleIntegerProperty(0);
        this.modifiedDay = new SimpleObjectProperty<LocalDate>(LocalDate.of(2018, 8, 20));
        
        //TODO 추후에 DB와 연동해서 버전 추가
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