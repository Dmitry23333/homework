package homework9;

import homework9.student.Student;
import java.util.*;
import java.util.stream.Collectors;
import static homework9.utils.GetAndCheckAdress.*;
import static homework9.utils.ReadWriteStudents.*;



public class StudentMain {
    public static void main(String[] args) {
        List <Student> list1=readBin(checkIsThereFile(getAdressFile()));
        List<Student> listTop=getTopStudents(list1,10);
        writeToBin(listTop,getAdressFile());
      //  writeToBin(listTop,"students.bin");
    }
   public static List<Student> getTopStudents(List<Student> list,int value){
        List<Student> topList=list.stream().limit(value).collect(Collectors.toList());
        System.out.println("Топ "+value+" по оценкам \n"+topList);
        return  topList;
   }












}




