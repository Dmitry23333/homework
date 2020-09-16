package homework3.calcs;

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalc {
   @Override
   public double  pow(double a, int b) {
       return Math.pow(a, b);
   }
    @Override
   public double abs(double a){
       return Math.abs(a);
   }
}
