package homework2.task2;


import static homework2.task1.CheckNumbers.inputCheckPositiveNumber;
import static homework2.task1.CheckNumbers.inputCheckTypeInt;

public class ArraysInputRepeats {
    public static void main(String[] args) {
        System.out.print("Введите размер массива ");
        int n=inputCheckPositiveNumber();
        int [] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Введите элемент массива ");
            int a=inputCheckTypeInt();
            arr[i]=a;
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

