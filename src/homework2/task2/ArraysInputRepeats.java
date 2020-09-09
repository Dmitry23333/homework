package homework2.task2;


import java.util.Scanner;

public class ArraysInputRepeats {
    public static void main(String[] args) {
        Scanner size = new Scanner(System.in);
        System.out.print("Введите размер массива ");
        int n= size.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            Scanner element = new Scanner(System.in);
            System.out.print("Введите элемент массива ");
            int a= element.nextInt();
            arr[i]=a;jjjhjhjhjhjhj
        }

        int i=0;
        do {
            System.out.print(arr[i]+" ");
            i++;
        }while (i<arr.length);
        System.out.println("DoWhile ");

        i=0;
        while(i<arr.length){
            System.out.print(arr[i]+" ");
            i++;
        }
        System.out.println("while");

        for (int a:arr){
            System.out.print(a+" ");
        }
        System.out.println("Foreach ");

        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.print("For ");
    }
}

