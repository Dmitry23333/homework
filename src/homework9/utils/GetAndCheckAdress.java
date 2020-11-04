package homework9.utils;

import homework9.student.CreateStudents;

import java.io.File;
import java.util.Scanner;

import static homework9.utils.ReadWriteStudents.writeToBin;
import static homework9.utils.ReadWriteStudents.writeToTxt;

public class GetAndCheckAdress {
    public static String checkIsThereFile(String path) {
        if (path.equals("file.bin")) {
            path = "students.bin";
        }
        File myFileBin = new File(path);
        if (!myFileBin.exists()) {
            writeToBin(CreateStudents.create(), path);
            String pathTxt = path.replaceAll(".bin", ".txt");
            writeToTxt(CreateStudents.create(), pathTxt);
            System.out.println("Создана коллекция и записана в бинарный и текстовый файлы " + path + " " + pathTxt);
        } else {
            System.out.println("Коллекция существует, можешь взять бинарный файл " + path);
        }
        return path;
    }

    public static String getAdressFile() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите адрес файла");
        String path=in.nextLine();
        if (path.trim().isEmpty()){
            return "file.bin";
        }
        return path;
    }
}
