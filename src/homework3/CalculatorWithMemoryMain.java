package homework3;

import homework3.calcs.CalculatorWithMemory;
import homework3.calcs.CalculatorWithOperator;

public class CalculatorWithMemoryMain {
    public static void main(String[] args) {
        CalculatorWithOperator withoperator=new CalculatorWithOperator();
        CalculatorWithMemory calc = new CalculatorWithMemory(withoperator);
        calc.save(calc.division(28,5));
        calc.save(calc.pow(calc.getResult(),2));
        calc.save(calc.add(calc.multiplication(15,7),calc.getResult()));
        calc.save(calc.add(4.1,calc.getResult()));
        System.out.println(calc.getResult());
        System.out.println(calc.getResult());
    }
}
