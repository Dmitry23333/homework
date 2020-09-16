package homework3.calcs;

public class CalculatorWithMemory extends CalculatorWithOperator implements  ICalcWithMemory {
    private double result;
    private boolean occupancy;//Заполненность результата
    private ICalc calc;
    public void save(double result){
        System.out.println("result was save");
        this.occupancy=true;
        this.result=result;
    }
    public double getResult(){
        if(!occupancy) {
            System.out.println("memory is empty");
            this.result=0;
        } else {
            this.occupancy=false;//Значение стёрто
        }
        return this.result;
    }
    public CalculatorWithMemory(ICalc calc){
        this.calc = calc;
    }
}