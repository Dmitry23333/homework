package homework3;

public class CalculatorWithOperator {

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
        int i=1;
        while (i<b){
            a *=a;
            i++;
        }
    return a;
    }

    public double abs(double a){
        if (a<0){
            return -a;
        }
        else return a;
    }




}
