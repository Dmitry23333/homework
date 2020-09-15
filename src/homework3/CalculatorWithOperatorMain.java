package homework3;

public class CalculatorWithOperatorMain {
    public static void main(String[] args) {
        CalculatorWithOperator calc = new CalculatorWithOperator();
        double result=calc.add(4.1,calc.add(calc.multiplication(15,7),calc.pow(calc.division(28,5),2)));
        double a=result/0;
        double b=result/0.0d;
        System.out.println(result);
        System.out.println(a);
        System.out.println(b);
    }
}