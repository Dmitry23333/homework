package homework3.calcs;

public class CalculatorWithOperator implements ICalc {
    public double add(double a, double b) {
        return a+b;
    }
    public double subtraction(double a, double b) {
        return a-b;
    }
    public double multiplication(double a, double b) {
        return a*b;
    }
    public double division(double a, double b) {
        return a/b;
    }
    public double  pow(double a, int b){
        double result=1;
        for (int i = 1; i <=b; i++) {
            result *=a;
        }
    return result;
    }
    public double abs(double a){
        if (a<0){
            return -a;
        }
        else return a;
    }
}
