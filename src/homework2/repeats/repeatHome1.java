package homework2.repeats;

public class RepeatHome1 {
    public static void main(String[] b) {
        String regex = "\\d+";
        StringBuilder builder = new StringBuilder();
        for(String s : b) {
            builder.append(s);
        }
        String str = builder.toString();
        int a = Integer.parseInt(str);
        if (!str.matches(regex) ) {
            System.out.println("Введен не числовой символ");
            return;
        }
        if (a>20 ) {
            System.out.println("Введено число,не соответсвующее условию(от 1 до 20)");
            return;
        }
        if(a==1){
            System.out.print(a);
            return;
        }
        System.out.print("1");
        long result = 1;
        int i=2;
        while (i<=a){
            System.out.print("*" + i);
            result *= i;
            i++;
        }
        System.out.print("="+result);
    }
}
