package homework9.comparator;

import java.util.Comparator;

import homework9.student.Student;

public class FIOComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getFio().compareTo(o2.getFio());
    }
}
