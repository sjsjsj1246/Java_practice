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

    private final StringProperty versionName;
    private final StringProperty author;
    private final ObjectProperty<LocalDate> modifiedDay;
    
    
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
    public Version(String versionName) {
        this.versionName = new SimpleStringProperty(versionName);

        // 테스트를 위해 초기화하는 더미 데이터
        this.author = new SimpleStringProperty("홍길동");
        this.modifiedDay = new SimpleObjectProperty<LocalDate>(LocalDate.of(2018, 8, 20));
    }

    public String getVersionName() {
        return versionName.get();
    }

    public void setVersionName(String versionName) {
        this.versionName.set(versionName);
    }

    public StringProperty versionNameProperty() {
        return versionName;
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