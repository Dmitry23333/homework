package operators;


import java.util.Objects;
import java.util.Scanner;

public class BranchingIf {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя ");
        String name1 = in.nextLine();
        in.close();
        String name = "Вася";
        if (Objects.equals(name,name1)) {
            System.out.println("Привет\nЯ тебя так долго ждал");
        }
        if (Objects.equals(name,name1)==false){
            System.out.println("Добрый день, а вы кто?");
        }

    }
}



