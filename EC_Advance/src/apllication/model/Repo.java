package apllication.model;

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
 * 저장소 모델 클래스
 *
 * @brief 저장소의 정보를 담는 클래스
 */
public class Repo {

    private final StringProperty Name;
    private final IntegerProperty sourceNum;
    private final ObjectProperty<LocalDate> modifiedDay;
    //저장소 내부의 소스 리스트
  	private ObservableList<Source> sourceData = FXCollections.observableArrayList();

    /**
     * 디폴트 생성자
     */
    public Repo() {
        this(null);
    }

    /**
     * 데이터를 초기화하는 생성자
     *
     * @param Name
     */
    public Repo(String Name) {
        this.Name = new SimpleStringProperty(Name);

        // 테스트를 위해 초기화하는 더미 데이터
        this.sourceNum = new SimpleIntegerProperty(0);
        this.modifiedDay = new SimpleObjectProperty<LocalDate>(LocalDate.of(2018, 8, 20));
        sourceData.add(new Source("test"));
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

    public void setBirthday(LocalDate birthday) {
        this.modifiedDay.set(birthday);
    }

    public ObjectProperty<LocalDate> modifiedDayProperty() {
        return modifiedDay;
    }
}