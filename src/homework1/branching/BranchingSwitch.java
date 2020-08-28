package homework1.branching;
import java.util.Scanner;

public class BranchingSwitch {
    public static void main (String[] arg){
            Scanner in = new Scanner(System.in);
            System.out.print("Введите имя ");
            String name1 = in.nextLine();
            in.close();
            switch (name1) {
                case "Вася": System.out.println("Привет\nЯ тебя так долго ждал");
                break;
                case "Анастасия": System.out.println("Я тебя так долго ждал");
                break;
                default:System.out.println("Добрый день, а вы кто?");
            }
    }
}
