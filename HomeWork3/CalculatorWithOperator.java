package HomeWork3;

public class CalculatorWithOperator {

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

    public double raisedTo(double a, int b) {
        if (b == 0) {
            return 1;
        } else {
            for (int i = 1; i < this.absolute(b); i++) {
                    a *= a;
            }
        }
        return b > 0 ? a : 1 / a;
    }

    public double absolute(double a) {
        return a < 0 ? -a : a;
    }

    public double squareRoot(double a) {
        final double PRECISION = 0.001;
        double result = 1;
        double buffer = (result + a / result) / 2;
        while (this.absolute(result - buffer) > PRECISION) {
            result = buffer;
            buffer = (result + a / result) / 2;
        }
        return result;
    }
}
