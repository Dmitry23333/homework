package homework2.repeats;
// ????? тупо для этого условия
public class RepeatHome4 {
    public static void main(String[] args) {
        long a = 1;
        long b;
        while (true){
            b=a;
            a *=3;
            System.out.println(a);
            if (a<0){
                System.out.println("до переполнения"+b);
                System.out.println("после переполнения"+a);
                return;
            }
        }
    }
}



