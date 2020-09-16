package homework3;

public class CalculatorWithMathCopyMain {
    public static void main(String[] args) {
        CalculatorWithMathCopy calc =new CalculatorWithMathCopy();
        double result=calc.add(4.1,calc.add(calc.multiplication(15,7),calc.pow(calc.division(28,5),2)));
        System.out.println(result);
        double a1=result/0;
        double b1=result/0.0d;
        System.out.println(a1);
        System.out.println(b1);
    }
}
