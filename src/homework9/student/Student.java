package homework9.student;

import java.io.Serializable;

public class Student  implements Serializable {
    private String firstName;
    private String surname;
    private String secondName;
    private String fio;
    private int grade;

    public Student(String surname,String firstName, String secondName, int grade){
        this.surname=surname;
        this.firstName=firstName;
        this.secondName=secondName;
        this.grade=grade;
    }

    public int getGrade() {
        return grade;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getFio() {
        return getSurname()+" "+getFirstName()+" "+getSecondName();
    }

    @Override
    public String toString() {
        return "Студент: "+getFio()+" оценка: "+grade;
    }
}