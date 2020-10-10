public class FactorialNew {
    public static void main(String[] b) {
        if (validateArgument(b)) {
            printFactorial(Integer.parseInt(b[0]));
        }
    }
    public static boolean validateArgument(String[] args){
        if (args.length!=1){
            System.out.println("Введите только одно число");
            return false;
        }
        String str = args[0];
        String regex = "\\d+";
        if (!str.matches(regex) ) {
            System.out.println("Введен не числовой символ или отрицательное число");
            return false;
        }
        int x = Integer.parseInt(str);
        if(x > 21){
            System.out.println("Число больше 21 цифры. Это не допустимо");
            return false;
        }
        if(x==1){
            System.out.print(x);
            return false;
        }
        return true;
    }
    public static void printFactorial(int x){
        System.out.print("1");
        long result=1;
        for (int i = 2; i <=x; i++) {
            result*=i;
            System.out.print("*"+i);
        }
        System.out.print("="+result);
    }
}


