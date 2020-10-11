package HomeWork3.Task8;

import HomeWork3.Task6.ICalculator;

public class CalculatorWithCounterDecorator implements ICalculator {
    private ICalculator calculator;
    private long countOperation;

    public CalculatorWithCounterDecorator(ICalculator calculator) {
        this.calculator = calculator;
    }

    public ICalculator getCalculator() {
        return calculator;
    }

    public long getCountOperation() {
        return countOperation;
    }

    @Override
    public double sum(double a, double b) {
        this.countOperation++;
        return calculator.sum(a, b);
    }

    @Override
    public double subtract(double a, double b) {
        this.countOperation++;
        return this.calculator.subtract(a, b);
    }

    @Override
    public double multi(double a, double b) {
        this.countOperation++;
        return this.calculator.multi(a, b);
    }

    @Override
    public double div(double a, double b) {
        this.countOperation++;
        return this.calculator.div(a, b);
    }

    @Override
    public double pow(double a, int b) {
        this.countOperation++;
        return this.calculator.pow(a, b);
    }

    @Override
    public double abs(double a) {
        this.countOperation++;
        return this.calculator.abs(a);
    }

    @Override
    public double sqr(double a) {
        this.countOperation++;
        return this.calculator.sqr(a);
    }
}
