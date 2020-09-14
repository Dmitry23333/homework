package homework3;

public class CalculatorWithMathCopyMain {
    public static void main(String[] args) {
        CalculatorWithMathCopy calc1 =new CalculatorWithMathCopy();
        double result=calc1.add(4.1,calc1.add(calc1.multiplication(15,7),calc1.pow(calc1.divison(28,5),2)));
        System.out.println(result);
        double a1=result/0;
        double b1=result/0.0d;
        System.out.println(a1);
        System.out.println(b1);
    }
}
