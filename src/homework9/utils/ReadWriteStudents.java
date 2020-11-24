package homework9.utils;

import homework9.student.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteStudents {
    public static void writeToTxt(List<Student> list, String file) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(String.valueOf(list));
            writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void writeToBin(List<Student> list, String path) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            if (path.equals("file.bin")) {
                System.out.println("Файл записан по умолчанию "+path);
            } else {
                System.out.println("Файл записан "+path);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static List<Student> readBin (String path) {
        List <Student> studentsList=new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            studentsList= (List<Student>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException" + e.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException" + ex.getMessage());
        }
        return studentsList;
    }
}
