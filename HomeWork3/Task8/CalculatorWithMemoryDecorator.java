package HomeWork3.Task8;

import HomeWork3.Task6.ICalculator;

public class CalculatorWithMemoryDecorator implements ICalculator  {
    private ICalculator calculator;
    private double valueInMemory;
    private double lastValue;

    public CalculatorWithMemoryDecorator(ICalculator calculator) {
        this.calculator = calculator;
    }

    public double getLastValue() {
        return lastValue;
    }

    public void setLastValue(double lastValue) {
        this.lastValue = lastValue;
    }

    public double getValueInMemory() {
        return valueInMemory;
    }

    public void setValueInMemory() {
        this.valueInMemory = this.lastValue;
        this.lastValue = 0;
    }

    @Override
    public double sum(double a, double b) {
        this.lastValue = this.calculator.sum(a, b);
        return this.lastValue;
    }

    @Override
    public double subtract(double a, double b) {
        this.lastValue = this.calculator.subtract(a, b);
        return this.lastValue;
    }

    @Override
    public double multi(double a, double b) {
        this.lastValue = this.calculator.multi(a, b);
        return this.lastValue;
    }

    @Override
    public double div(double a, double b) {
        this.lastValue = this.calculator.div(a,b);
        return this.lastValue;
    }

    @Override
    public double pow(double a, int b) {
        this.lastValue = this.calculator.pow(a, b);
        return this.lastValue;
    }

    @Override
    public double abs(double a) {
        this.lastValue = this.calculator.abs(a);
        return this.lastValue;
    }

    @Override
    public double sqr(double a) {
        this.lastValue = sqr(a);
        return this.lastValue;
    }
}
