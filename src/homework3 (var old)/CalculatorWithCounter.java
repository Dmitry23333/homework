package homework3;

public class CalculatorWithCounter {
    private int counter=0;
    private CalculatorWithOperator withOperator;
    private CalculatorWithMathCopy withMathCopy;
    private CalculatorWithMathExtends withMathExtends;

    public CalculatorWithCounter(CalculatorWithOperator calculatorWithOperator){
        this.withOperator=calculatorWithOperator;
    }
    public CalculatorWithCounter(CalculatorWithMathCopy calculatorWithMathCopy) {
        this.withMathCopy = calculatorWithMathCopy;
    }
    public CalculatorWithCounter(CalculatorWithMathExtends calculatorwithMathExtends) {
        this.withMathExtends = calculatorwithMathExtends;
    }
    public int getCounterOperation(){
        return counter;
    }
    public double add(double a,double b){
        this.counter++;
        if (this.withOperator!=null){
            return this.withOperator.add(a,b);
        }
        if (this.withMathCopy!=null){
            return this.withMathCopy.add(a,b);
        }
        if (this.withMathExtends!=null){
            return this.withMathExtends.add(a,b);
        }
        return 0;
    }
    public double subtraction(double a,double b){
        this.counter++;
        if (this.withOperator!=null){
            return this.withOperator.subtraction(a,b);
        }
        if (this.withMathCopy!=null){
            return this.withMathCopy.subtraction(a,b);
        }
        if (this.withMathExtends!=null){
            return this.withMathExtends.subtraction(a,b);
        }
        return 0;
    }
    public double multiplication(double a,double b){
        this.counter++;
        if (this.withOperator!=null){
            return this.withOperator.multiplication(a,b);
        }
        if (this.withMathCopy!=null){
            return this.withMathCopy.multiplication(a,b);
        }
        if (this.withMathExtends!=null){
            return this.withMathExtends.multiplication(a,b);
        }
        return 0;
    }
    public double pow(double a,int b){
        this.counter++;
        if (this.withOperator!=null){
            return this.withOperator.pow(a,b);
        }
        if (this.withMathCopy!=null){
            return this.withMathCopy.pow(a,b);
        }
        if (this.withMathExtends!=null){
            return this.withMathExtends.pow(a,b);
        }
        return 0;
    }
    public double division(double a,double b){
        this.counter++;
        if (this.withOperator!=null){
            return this.withOperator.division(a,b);
        }
        if (this.withMathCopy!=null){
            return this.withMathCopy.division(a,b);
        }
        if (this.withMathExtends!=null){
            return this.withMathExtends.division(a,b);
        }
        return 0;
    }
    public double abs(double a){
        this.counter++;
        if (this.withOperator!=null){
            return this.withOperator.abs(a);
        }
        if (this.withMathCopy!=null){
            return this.withMathCopy.abs(a);
        }
        if (this.withMathExtends!=null){
            return this.withMathExtends.abs(a);
        }
        return 0;
    }
}
