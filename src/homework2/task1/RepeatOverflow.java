package homework2.task1;
// ????? тупо для этого условия
public class RepeatOverflow {
    public static void main(String[] args) {
        long a = 1;
        long b;
        while (true){
            b=a;
            a=a*3;
            if(a<0) {
                System.out.println("до переполнения "+b);
                System.out.println("после переполнения " + a);
                return;
            }
        }
    }
}



