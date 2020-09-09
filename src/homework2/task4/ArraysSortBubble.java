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
        SortBubble(test3);kjkj
        SortBubble(test4);
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
