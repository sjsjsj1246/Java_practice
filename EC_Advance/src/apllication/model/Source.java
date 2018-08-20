package apllication.model;

import java.time.LocalDate;

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
public class Source {

    private final StringProperty Name;
    private final IntegerProperty verNum;
    private final ObjectProperty<LocalDate> modifiedDay;

    /**
     * ����Ʈ ������
     */
    public Source() {
        this(null);
    }

    /**
     * �����͸� �ʱ�ȭ�ϴ� ������
     *
     * @param Name
     */
    public Source(String Name) {
        this.Name = new SimpleStringProperty(Name);

        // �׽�Ʈ�� ���� �ʱ�ȭ�ϴ� ���� ������
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