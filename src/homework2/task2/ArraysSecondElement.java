package homework2.task2;

import java.util.Scanner;

public class ArraysSecondElement {
    public static void main(String[] args) {
        Scanner size = new Scanner(System.in);
        System.out.print("Введите размер массива ");
        int n= size.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            Scanner element = new Scanner(System.in);
            System.out.print("Введите элемент массива "+i+" ");
            int a= element.nextInt();
            arr[i]=a;
        }
        for (int i = 0; i < arr.length; i++) {
            if(i%2==0){
                System.out.print(arr[i]);
            }
        }
    }
}
