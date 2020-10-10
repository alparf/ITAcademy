package HomeWork3;

public class CalculatorWithCounter {
    private long countOperation;
    private final AbstractCalculator calculator;

    public CalculatorWithCounter(CalculatorWithOperator calculator) {
        this.calculator = calculator;
    }

    public CalculatorWithCounter(CalculatorWithMathExtends calculator) {
        this.calculator = calculator;
    }

    public CalculatorWithCounter(CalculatorWithMathCopy calculator) {
        this.calculator = calculator;
    }

    public long getCountOperation() {
        return countOperation;
    }

    public double summation(double a, double b) {
        this.countOperation++;
        return calculator.summation(a, b);
    }

    public double subtraction(double a, double b) {
        this.countOperation++;
        return calculator.subtraction(a, b);
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
        return calculator.raiseTo(a, b);
    }

    public double absolute(double a) {
        this.countOperation++;
        return calculator.absolute(a);
    }

    public double squareRoot(double a) {
        this.countOperation++;
        return calculator.squareRoot(a);
    }

}
