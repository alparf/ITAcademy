package HomeWork3;

public class CalculatorWithCounterInterface {
    private long countOperation;
    private ICalculator calculator;

    public CalculatorWithCounterInterface(ICalculator calculator) {
        this.calculator = calculator;
    }

    public long getCountOperation() {
        return countOperation;
    }

    public double summation(double a, double b) {
        this.countOperation++;
        return this.calculator.summation(a, b);
    }

    public double subtraction(double a, double b) {
        this.countOperation++;
        return  this.calculator.subtraction(a, b);
    }

    public double multiplication(double a, double b) {
        this.countOperation++;
        return calculator.multiplication(a, b);
    }

    public double division(double a, double b) {
        this.countOperation++;
        return calculator.division(a, b);
    }

    public double raiseTo(double a, int b) {
        this.countOperation++;
        return this.calculator.raiseTo(a, b);
    }

    public double absolute(double a) {
        this.countOperation++;
        return this.calculator.absolute(a);
    }

    public double squareRoot(double a) {
        this.countOperation++;
        return this.calculator.squareRoot(a);
    }
}
