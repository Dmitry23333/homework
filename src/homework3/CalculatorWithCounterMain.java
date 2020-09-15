package homework3;

public class CalculatorWithCounterMain {
    public static void main(String[] args) {
        CalculatorWithOperator operator=new CalculatorWithOperator();
        CalculatorWithCounter calc=new CalculatorWithCounter(operator);
        double result=calc.add(4.1,calc.add(calc.multiplication(15,7),calc.pow(calc.division(28,5),2)));
        System.out.println(result);
        double a1=result/0;
        double b1=result/0.0d;
        System.out.println(calc.getCounterOperation());
    }
}
