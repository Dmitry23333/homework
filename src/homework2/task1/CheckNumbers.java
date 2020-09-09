package homework2.task1;

import java.util.Scanner;

public class CheckNumbers {
    public static int inputCheckPositiveNumber() {
        Scanner in = new Scanner(System.in);
        String regex ="^[1-9]\\d*$" ;
        String symbol = in.nextLine();
        while (!symbol.matches(regex)) {
            System.out.println("Повторить ввод. Введите положительное число");
            symbol=in.nextLine();
        }
        return Integer.parseInt(symbol);
    }


    public static double inputCheckTypeDouble(){
        Scanner in = new Scanner(System.in);
        while(!in.hasNextDouble ()){
            System.out.println("Повторить ввод. Введите целое число");
            in.nextLine();
        }
        return in.nextDouble();
    }

    public static int inputCheckTypeInt(){
        Scanner in = new Scanner(System.in);
        while(!in.hasNextInt ()){
            System.out.println("Повторить ввод. Введите целое число");
            in.nextLine();
        }
        return in.nextInt();
    }
}
