package homework3.calcs;

public interface ICalcWithMemory extends ICalc {
    void save(double result);
    public double getResult();
}
