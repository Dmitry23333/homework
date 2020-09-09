package homework2.task1;

import java.util.Scanner;

import static homework2.task1.CheckNumbers.inputCheckPositiveNumber;
import static homework2.task1.CheckNumbers.inputCheckTypeDouble;

public class RepeatPow {
    public static void main(String[] args) {
        System.out.print("Введите число ");
        double number1 =inputCheckTypeDouble();
        System.out.print("Введите степень  ");
        int number2=inputCheckPositiveNumber();
        System.out.println(number1 +" в степени "+number2 + "= "+Math.pow(number1,number2));
    }
}

