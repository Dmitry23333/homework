package homework3.calcs;

public class CalculatorWithCounter implements ICalcWithCounter {
    private  int counter=0;
    private final ICalc calc;
    public CalculatorWithCounter(ICalc calc){
        this.calc = calc;
    }
    public int getCounterOperation(){
        return this.counter;
    }
    public double add(double a,double b){
        this.counter++;
        return this.calc.add(a,b);
    }
    public double subtraction(double a,double b){
        this.counter++;
        return this.calc.subtraction(a,b);
    }
    public double multiplication(double a,double b){
        this.counter++;
        return this.calc.multiplication(a,b);
    }
    public double pow(double a,int b){
        this.counter++;
        return this.calc.pow(a,b);
    }
    public double division(double a,double b){
        this.counter++;
        return this.calc.division(a,b);
    }
    public double abs(double a){
        this.counter++;
        return this.calc.abs(a);
    }
}
