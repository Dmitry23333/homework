package homework2.repeats;

import java.util.Scanner;

public class repeatPow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число ");
        double number1 =0;
        while(!in.hasNextDouble ()){
            System.out.println("Повторить ввод. Введите число");
            in.next();
        }
        number1 =  in.nextDouble();
        Scanner in1 = new Scanner(System.in);
        System.out.print("Введите степень  ");
        int number2 = 0;
        while(!in1.hasNextInt()){
            System.out.println("Повторить ввод. Степень должна быть равна  целому число");
            in1.next();
        }
        number2=in1.nextInt();
        while (number2<0){
           System.out.println("Введите степень больше или равную 0");
           number2=in1.nextInt();
        }
           System.out.println(number1 +" в степени "+number2 + "= "+Math.pow(number1,number2));
    }
}

