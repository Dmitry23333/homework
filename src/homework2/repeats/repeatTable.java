package homework2.repeats;

public class RepeatTable {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 2; j <= 5; j++) {
                System.out.print(+j + "x" + i + "=" + (j * i) + "\t");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i <= 10; i++) {
            for (int j = 6; j <= 9; j++) {
                System.out.print(+j + "x" + i + "=" + (j * i) + "\t");

            }
            System.out.println();
        }
    }
}
