package HomeWork3;

public class CalculatorWithMemory {
    private ICalculator calculator;
    private double valueInMemory;
    private double lastValue;

    public CalculatorWithMemory(ICalculator calculator){
        this.calculator = calculator;
    }

    public double getLastValue() {
        return lastValue;
    }

    public void setLastValue(double lastValue) {
        this.lastValue = lastValue;
    }

    public double getValueInMemory() {
        double value = valueInMemory;
        valueInMemory = 0;
        return value;
    }

    public void setValueInMemory() {
        this.valueInMemory = this.lastValue;
        this.lastValue = 0;
    }

    public void summation(double value) {
        this.lastValue = this.calculator.summation(this.lastValue, value);
    }

    public void subtraction(double value) {
        this.lastValue = this.calculator.subtraction(this.lastValue, value);
    }

    public void multiplication(double value) {
        this.lastValue = this.calculator.multiplication(this.lastValue, value);
    }

    public void division(double value) {
        this.lastValue = this.calculator.division(this.lastValue, value);
    }

    public void raiseTo(int value) {
        this.lastValue = this.calculator.raiseTo(this.lastValue, value);
    }

    public void absolute() {
        this.lastValue = this.calculator.absolute(this.lastValue);
    }

    public void squareRoot() {
        this.lastValue = this.calculator.squareRoot(this.lastValue);
    }
}
