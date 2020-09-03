package homework1.branching;

import java.util.Objects;
import java.util.Scanner;

public class BranchingElseIf {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя ");
        String name1 = in.nextLine();
        in.close();
        String name = "Вася";
        String name2="Анастасия";
        if (Objects.equals(name,name1)) {
            System.out.println("Привет\nЯ тебя так долго ждал");
        }
        else { if (Objects.equals(name2,name1)){
            System.out.println("Я тебя так долго ждал");
            }
        else {
            System.out.println("Добрый день, а вы кто?");
        }
        }

    }
}
