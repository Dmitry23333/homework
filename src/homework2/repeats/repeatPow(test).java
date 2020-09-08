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
        System.out.print("Введите степень  ");
        while(!in1.hasNextInt()){
            System.out.println("Повторить ввод. Степень равна положительному целому числу");
           in1.nextInt();

        }
       int number2=in1.nextInt();

        System.out.println(number1 +" в степени "+number2 + "= "+Math.pow(number1,number2));
    }
}

