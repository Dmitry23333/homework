package homework2.task1;

import java.util.Scanner;

public class Table2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("С какого числа выводить таблицу?");
        int startNumber=scanner.nextInt();
        System.out.println("Введите макс кол-во столбцов в строке");
        int maxCountCulomnsInRow=scanner.nextInt();
        System.out.println("Введи количество столбцов в таблице");
        int countCulomns=scanner.nextInt();
        int countRow=(int)Math.ceil(countCulomns/(double)maxCountCulomnsInRow);
        for (int i = 0; i < countRow; i++) {
            int currentTo= startNumber+maxCountCulomnsInRow+(maxCountCulomnsInRow*i)-1;
            int tmp=countCulomns-maxCountCulomnsInRow*i;
            if (tmp<maxCountCulomnsInRow){
                currentTo=startNumber+(maxCountCulomnsInRow*i)-1;
            }
            printRow(startNumber+(maxCountCulomnsInRow*i),currentTo);
            System.out.println();
        }
    }
    /**
     * Печать строки с указанными столбцами
     * @param from столбец с которого начинается строка
     * @param to столбец которым заканчиватся строка
     */
    public static void printRow(int from, int to){
        for (int i = 1; i <= 10; i++) {
            for (int j = from; j <= to ; j++) {
                System.out.print(j+" x "+ i + " = "+ (j*i)+"\t");
            }
            System.out.println();
        }
    }
}
