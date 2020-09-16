package homework3;

public class CalculatorWithMathExtends extends CalculatorWithOperator {
   @Override
   public double  pow(double a, int b) {
       return Math.pow(a, b);
   }

   @Override
   public double abs(double a){
       return Math.abs(a);
   }
}
