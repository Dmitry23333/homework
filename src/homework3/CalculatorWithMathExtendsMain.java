package homework3;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {
        CalculatorWithMathExtends calc2 =new CalculatorWithMathExtends();
        double result=calc2.add(4.1,calc2.add(calc2.multiplication(15,7),calc2.pow(calc2.divison(28,5),2)));
        System.out.println(result);
        double a2=result/0;
        double b2=result/0.0d;
        System.out.println(a2);
        System.out.println(b2);
    }
}
