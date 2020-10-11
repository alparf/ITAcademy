package HomeWork3;

public class CalculatorWithMemoryDecorator implements ICalculator {
    private ICalculator calculator;

    public CalculatorWithMemoryDecorator(ICalculator calculator) {
        this.calculator = calculator;
    }

    public ICalculator getCalculator() {
        return calculator;
    }

    @Override
    public double sum(double a, double b) {
       return this.sum(a, b);
    }

    @Override
    public double sub(double a, double b) {
        return this.sub(a, b);
    }

    @Override
    public double multi(double a, double b) {
        return this.multi(a, b);
    }

    @Override
    public double div(double a, double b) {
        return this.div(a, b);
    }

    @Override
    public double pow(double a, int b) {
        return this.pow(a, b);
    }

    @Override
    public double abs(double a) {
        return this.abs(a);
    }

    @Override
    public double sqr(double a) {
        return this.sqr(a);
    }
}
