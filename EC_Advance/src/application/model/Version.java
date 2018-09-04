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
 * 버전 모델 클래스
 *
 * @brief 저장소의 정보를 담는 클래스
 */
public class Version {

    private final StringProperty Name;
    private final StringProperty author;
    private final ObjectProperty<LocalDate> modifiedDay;
    
    //소스 내부의 버전 리스트
    private ObservableList<Version> versionData = FXCollections.observableArrayList();
    
    /**
     * 디폴트 생성자
     */
    public Version() {
        this(null);
    }

    /**
     * 데이터를 초기화하는 생성자
     *
     * @param Name
     */
    public Version(String Name) {
        this.Name = new SimpleStringProperty(Name);

        // 테스트를 위해 초기화하는 더미 데이터
        this.author = new SimpleStringProperty("홍길동");
        this.modifiedDay = new SimpleObjectProperty<LocalDate>(LocalDate.of(2018, 8, 20));
    }

    public String getName() {
        return Name.get();
    }

    public void setName(String Name) {
        this.Name.set(Name);
    }

    public StringProperty nameProperty() {
        return Name;
    }
    
    public String getAuthor() {
        return author.get();
    }

    public void setAuthor(String sourceNum) {
        this.author.set(sourceNum);
    }

    public StringProperty authorProperty() {
        return author;
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