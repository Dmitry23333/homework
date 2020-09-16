package homework3;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {
        CalculatorWithMathExtends calc =new CalculatorWithMathExtends();
        double result=calc.add(4.1,calc.add(calc.multiplication(15,7),calc.pow(calc.division(28,5),2)));
        System.out.println(result);
        double a2=result/0;
        double b2=result/0.0d;
        System.out.println(a2);
        System.out.println(b2);
    }
}
