package homework2.task4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArraySortShaker {
    public static void main(String[] args) {
        int[] test1 = {1, 2, 3, 4, 5,6};
        int[] test2 = {1,1,1,1};
        int[] test3 = {9,1,5,99,9,9};
        int[] test4 = {};

        SortShaker(test1);
        SortShaker(test2);
        SortShaker(test3);
        SortShaker(test4);

        Random rand=new Random();
        int[] array=new int[rand.nextInt(10)];
        for (int i=0;i< array.length; i++){
            array[i]=rand.nextInt(10);
        }
        SortShaker(array);

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
        SortShaker(arr);
        }

    public static void SortShaker(int[] array) {
        System.out.print(Arrays.toString(array));
        int temp;
        int left = 0;
        int right = array.length - 1;
        do {
            for (int i = left; i < right; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
            right--;
            for (int i = right; i > left; i--) {
                if (array[i] < array[i - 1]) {
                    temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                }
            }
            left++;
        }
        while (left < right);
        System.out.println("--->"+Arrays.toString(array));
    }
}