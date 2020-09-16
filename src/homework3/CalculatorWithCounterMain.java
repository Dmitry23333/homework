package homework3;

import homework3.calcs.*;

public class CalculatorWithCounterMain {
    public static void main(String[] args) {
        CalculatorWithOperator withoperator=new CalculatorWithOperator();
        ICalcWithCounter calc=new CalculatorWithCounter(withoperator);
        double result=calc.add(4.1,calc.add(calc.multiplication(15,7),calc.pow(calc.division(28,5),2)));
        System.out.println(result);
        double a1=result/0;
        double b1=result/0.0d;
        System.out.println(calc.getCounterOperation());
    }
}
