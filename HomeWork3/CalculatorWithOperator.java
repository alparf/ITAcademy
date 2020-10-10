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

    public double raisedTo(double a, int b) {
        if (b == 0) {
            return 1;
        } else {
            for (int i = 1; i < b; i++) {
                a *= a;
            }
        }
        return a;
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
