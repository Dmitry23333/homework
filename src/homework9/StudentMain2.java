package homework9;

import homework9.comparator.FIOComparator;
import homework9.comparator.GradeComparator;
import homework9.student.Student;

import java.util.List;
import java.util.stream.Collectors;

import static homework9.utils.GetAndCheckAdress.getAdressFile;
import static homework9.utils.ReadWriteStudents.readBin;

public class StudentMain2 {
    public static void main(String[] args) {
        List<Student>list=readBin("students.bin");
        //List<Student>list1=readBin(getAdressFile());
        getLastStudents(list,10);
    }
    public static List<Student> getLastStudents(List<Student> list,int value){
        List<Student> lastList=list.stream().skip(list.size()-value).collect(Collectors.toList());
        System.out.println("Топ "+value+" студентов с конца   \n"+lastList);
        return  lastList;
    }
}
