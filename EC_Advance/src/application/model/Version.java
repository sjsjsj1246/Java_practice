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
 * ���� �� Ŭ����
 *
 * @brief ������� ������ ��� Ŭ����
 */
public class Version {

    private final StringProperty Name;
    private final StringProperty author;
    private final ObjectProperty<LocalDate> modifiedDay;
    
    //�ҽ� ������ ���� ����Ʈ
    private ObservableList<Version> versionData = FXCollections.observableArrayList();
    
    /**
     * ����Ʈ ������
     */
    public Version() {
        this(null);
    }

    /**
     * �����͸� �ʱ�ȭ�ϴ� ������
     *
     * @param Name
     */
    public Version(String Name) {
        this.Name = new SimpleStringProperty(Name);

        // �׽�Ʈ�� ���� �ʱ�ȭ�ϴ� ���� ������
        this.author = new SimpleStringProperty("ȫ�浿");
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