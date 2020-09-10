package homework2.task4;

import java.util.Arrays;

public class ArraysSortBubble {
    public static void main(String[] args) {
        int[] test1 = {1, 2, 3, 4, 5, 6};
        int[] test2 = {1, 1, 1, 1};
        int[] test3 = {9, 1, 5, 99, 9, 9};
        int[] test4 = {};

        SortBubble(test1);
        SortBubble(test2);
        SortBubble(test3);
        SortBubble(test4);

	 Random rand=new Random();
        int[] array=new int[rand.nextInt(10)];
        for (int i=0;i< array.length; i++){
            array[i]=rand.nextInt(10);
        }
        SortBubble(array);

        Scanner size = new Scanner(System.in);
        System.out.print(" Введите размер массива ");
        int n= size.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            Scanner element = new Scanner(System.in);
            System.out.print("Введите элемент массива "+i+" ");
            int a= element.nextInt();
            arr[i]=a;
        }
        SortBubble(arr);
    }

    public static void SortBubble(int[] array) {
        System.out.print(Arrays.toString(array));
        boolean flag = false;
        int temp;
        while (!flag) {
            flag = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    flag = false;
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        System.out.println("--->"+Arrays.toString(array));
    }
}
