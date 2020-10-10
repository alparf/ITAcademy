package HomeWork3;

public class CalculatorWithMathExtends extends CalculatorWithOperator {

    @Override
    public double raiseTo(double a, int b) {
        return Math.pow(a, b);
    }

    @Override
    public double absolute(double a) {
        return Math.abs(a);
    }

    @Override
    public double squareRoot(double a) {
        return Math.sqrt(a);
    }
}
