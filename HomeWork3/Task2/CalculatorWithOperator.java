package HomeWork3.Task2;

import HomeWork3.Task6.ICalculator;

public class CalculatorWithOperator implements ICalculator {

    public double sum(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multi(double a, double b) {
        return a * b;
    }

    public double div(double a, double b) {
        return a / b;
    }

    /**
     *
     * @param a first argument (any positive number)
     * @param b second argument (any integer)
     * @return the value of the first argument raised to the power of the second argument
     */

    public double pow(double a, int b) {
        if (b == 0) {
            return 1;
        } else {
            for (int i = 1; i < this.abs(b); i++) {
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

    public double abs(double a) {
        return a < 0 ? -a : a;
    }

    /**
     *
     * @param a any number
     * @return square root of "a" or NaN if a < 0
     */

    public double sqr(double a) {
        if (a < 0) {
            return Double.NaN;
        }
        if (a == 0) {
            return 0;
        }
        final double PRECISION = 0.0001;
        double result = 1;
        double buffer = (result + a / result) / 2;
        while (this.abs(result - buffer) > PRECISION) {
            result = buffer;
            buffer = (result + a / result) / 2;
        }
        int integerResult = (int) result;
        return integerResult * integerResult == a ? integerResult : result;
    }
}
