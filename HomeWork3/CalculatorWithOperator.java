package HomeWork3;

public class CalculatorWithOperator implements ICalculator {

    public double summation(double a, double b) {
        return a + b;
    }

    public double subtraction(double a, double b) {
        return a - b;
    }

    public double multiplication(double a, double b) {
        return a * b;
    }

    public double division(double a, double b) {
        return a / b;
    }

    /**
     *
     * @param a first argument (any positive number)
     * @param b second argument (any integer)
     * @return the value of the first argument raised to the power of the second argument
     */

    public double raiseTo(double a, int b) {
        if (b == 0) {
            return 1;
        } else {
            for (int i = 1; i < this.absolute(b); i++) {
                    a *= a;
            }
        }
        return b > 0 ? a : 1 / a;
    }

    /**
     *
     * @param a any number
     * @return the absolute value of "a"
     */

    public double absolute(double a) {
        return a < 0 ? -a : a;
    }

    /**
     *
     * @param a any number
     * @return square root of "a" or NaN if a < 0
     */

    public double squareRoot(double a) {
        if (a < 0) {
            return Double.NaN;
        }
        if (a == 0) {
            return 0;
        }
        final double PRECISION = 0.0001;
        double result = 1;
        double buffer = (result + a / result) / 2;
        while (this.absolute(result - buffer) > PRECISION) {
            result = buffer;
            buffer = (result + a / result) / 2;
        }
        int integerResult = (int) result;
        return integerResult * integerResult == a ? integerResult : result;
    }
}
