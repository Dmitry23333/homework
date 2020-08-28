package operators.homework6;
import java.util.Scanner;

public class BranchingSwitch {
    public static void main (String[] arg){
            Scanner in = new Scanner(System.in);
            System.out.print("Введите имя ");
            String name1 = in.nextLine();
            in.close();
            switch (name1) {
                case "Вася": System.out.println("Привет");
                    System.out.println("Я тебя так долго ждал");
                break;
                default:System.out.println("Добрый день, а вы кто?");
            }
    }
}
