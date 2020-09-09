package homework2.task2;

import java.util.Scanner;

public class ArraysReverseMain {
    public static void main(String[] args) {
        Scanner size = new Scanner(System.in);
        System.out.print("Введите размер массива ");
        int n= size.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            Scanner element = new Scanner(System.in);
            System.out.print("Введите элемент массива ");
            int a= element.nextInt();
            arr[i]=a;
        }

        int i=arr.length-1;
        do {
            System.out.print(arr[i]+" ");
            i--;
        }while (i>=0);
        System.out.println("DoWhile ");

        i=arr.length-1;
        while(i>=0){
            System.out.print(arr[i]+" ");
            i--;
        }
        System.out.println("while");

        for (i = arr.length-1; i >=0;i-- ) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("For ");

        for (i=0; i<arr.length/2; i++ ){
            int temp=arr[arr.length-i-1];
            arr[arr.length-i-1]=arr[i];
            arr[i]=temp;
        }
        for (int a:arr) {
            System.out.print(a+" ");
        }
        System.out.print("Foreach after Reverse ");
    }
}
