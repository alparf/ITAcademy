package HomeWork3.Task3;

import HomeWork3.Task6.ICalculator;

public class CalculatorWithMathCopy implements ICalculator {

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

    public double pow(double a, int b) {
        return Math.pow(a, b);
    }

    public double abs(double a) {
        return Math.abs(a);
    }

    public double sqr(double a) {
        return Math.sqrt(a);
    }
}
