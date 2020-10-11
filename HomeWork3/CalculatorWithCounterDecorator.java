package HomeWork3;

public class CalculatorWithCounterDecorator implements ICalculator {
    private ICalculator calculator;

    public CalculatorWithCounterDecorator(ICalculator calculator) {
        this.calculator = calculator;
    }

    public ICalculator getCalculator() {
        return calculator;
    }

    @Override
    public double sum(double a, double b) {
        return this.calculator.sum(a, b);
    }

    @Override
    public double sub(double a, double b) {
        return this.calculator.sub(a, b);
    }

    @Override
    public double multi(double a, double b) {
        return this.calculator.multi(a, b);
    }

    @Override
    public double div(double a, double b) {
        return this.calculator.div(a, b);
    }

    @Override
    public double pow(double a, int b) {
        return this.calculator.pow(a, b);
    }

    @Override
    public double abs(double a) {
        return this.calculator.abs(a);
    }

    @Override
    public double sqr(double a) {
        return this.calculator.sqr(a);
    }
}
