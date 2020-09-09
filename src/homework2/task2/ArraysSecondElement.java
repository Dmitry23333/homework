package homework2.task2;

import java.util.Scanner;

import static homework2.task1.CheckNumbers.inputCheckPositiveNumber;
import static homework2.task1.CheckNumbers.inputCheckTypeInt;

public class ArraysSecondElement {
    public static void main(String[] args) {
        System.out.print("Введите размер массива ");
        int n=inputCheckPositiveNumber();
        int[] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Введите элемент массива "+i+" ");
            arr[i]=inputCheckTypeInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if(i%2==0){
                System.out.print(arr[i]);
            }
        }
    }
}
