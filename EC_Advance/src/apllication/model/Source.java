package apllication.model;

import java.time.LocalDate;

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
public class Source {

    private final StringProperty Name;
    private final IntegerProperty verNum;
    private final ObjectProperty<LocalDate> modifiedDay;

    /**
     * 디폴트 생성자
     */
    public Source() {
        this(null);
    }

    /**
     * 데이터를 초기화하는 생성자
     *
     * @param Name
     */
    public Source(String Name) {
        this.Name = new SimpleStringProperty(Name);

        // 테스트를 위해 초기화하는 더미 데이터
        this.verNum = new SimpleIntegerProperty(0);
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
    
    public int getVerNum() {
        return verNum.get();
    }

    public void setVerNum(int sourceNum) {
        this.verNum.set(sourceNum);
    }

    public IntegerProperty verNumProperty() {
        return verNum;
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