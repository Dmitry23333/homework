package homework2.repeats;

import java.util.Scanner;

public class repeatPow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число ");
        while(!in.hasNextDouble ()){
            System.out.println("Повторить ввод. Введите число");
            in.nextLine();
        }
        Double number1 =  in.nextDouble();
        Scanner in1 = new Scanner(System.in);
        String regex="\\d+";
        System.out.print("Введите степень  ");
        String number2=in1.nextLine();
        while(!number2.matches(regex)){
            System.out.println("Повторить ввод. Степень равна положительному целому числу");
            number2=in1.nextLine();
        }
        int power=Integer.parseInt(number2);
        System.out.println(number1 +" в степени "+number2 + "= "+Math.pow(number1,power));
    }
}

