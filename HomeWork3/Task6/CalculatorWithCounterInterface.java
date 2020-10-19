package HomeWork3.Task6;

public class CalculatorWithCounterInterface {
    private long countOperation;
    private final ICalculator calculator;

    public CalculatorWithCounterInterface(ICalculator calculator) {
        this.calculator = calculator;
    }

    public long getCountOperation() {
        return countOperation;
    }

    public double sum(double a, double b) {
        this.countOperation++;
        return this.calculator.sum(a, b);
    }

    public double sub(double a, double b) {
        this.countOperation++;
        return  this.calculator.subtract(a, b);
    }

    public double multi(double a, double b) {
        this.countOperation++;
        return calculator.multi(a, b);
    }

    public double div(double a, double b) {
        this.countOperation++;
        return calculator.div(a, b);
    }

    public double pow(double a, int b) {
        this.countOperation++;
        return this.calculator.pow(a, b);
    }

    public double abs(double a) {
        this.countOperation++;
        return this.calculator.abs(a);
    }

    public double sqr(double a) {
        this.countOperation++;
        return this.calculator.sqr(a);
    }
}
