package homework2.task1;
// ????? тупо для этого условия
public class RepeatOverflow {
    public static void main(String[] args) {
        byte a = 1;
        byte b;
        while (true){
            b=a;
            a *=5;
            System.out.println(a);
            if (a<0){
                System.out.println(b);
                System.out.println("после переполнения "+a);
                return;
            }
        }
    }
}



