package homework2.repeats;

public class repeatHome5 {
    public static void main(String[] args) {
        for (int i =1; i <=10; i++) {
            if(i==5){
                System.out.print("\r");
            }
            for (int j = 2; j <= 9; j++) {
                if(i<10){
                    System.out.print(j + "x" + i + "= " + (j * i)+"\t");
                }else {
                   System.out.print(j + "x" + i + "=" + (j * i)+"\t");
                }
            }
             System.out.println();
        }
    }

}
