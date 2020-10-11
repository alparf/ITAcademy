package HomeWork3.Task7;

import HomeWork3.Task6.ICalculator;

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
    }

    public void sum(double value) {
        this.lastValue = this.calculator.sum(this.lastValue, value);
    }

    public void subtract(double value) {
        this.lastValue = this.calculator.subtract(this.lastValue, value);
    }

    public void multi(double value) {
        this.lastValue = this.calculator.multi(this.lastValue, value);
    }

    public void div(double value) {
        this.lastValue = this.calculator.div(this.lastValue, value);
    }

    public void pow(int value) {
        this.lastValue = this.calculator.pow(this.lastValue, value);
    }

    public void abs() {
        this.lastValue = this.calculator.abs(this.lastValue);
    }

    public void sqr() {
        this.lastValue = this.calculator.sqr(this.lastValue);
    }
}
