package HomeWork3;

public class CalculatorWithCounter {
    private long countOperation;
    private CalculatorWithOperator userCalculator;
    private CalculatorWithMathCopy mathCalculator;
    private boolean isUserInit;

    public CalculatorWithCounter(CalculatorWithOperator calculator) {
        this.userCalculator = calculator;
        this.isUserInit = true;
    }

    public CalculatorWithCounter(CalculatorWithMathExtends calculator) {
        this.userCalculator = calculator;
        this.isUserInit = true;
    }

    public CalculatorWithCounter(CalculatorWithMathCopy calculator) {
        this.mathCalculator = calculator;
        this.isUserInit = false;
    }

    public long getCountOperation() {
        return countOperation;
    }

    public double summation(double a, double b) {
        this.countOperation++;
        if (isUserInit) {
            return userCalculator.summation(a, b);
        } else {
            return mathCalculator.summation(a, b);
        }
    }

    public double subtraction(double a, double b) {
        this.countOperation++;
        if (isUserInit) {
            return userCalculator.subtraction(a, b);
        } else {
            return mathCalculator.subtraction(a, b);
        }
    }

    public double multiplication(double a, double b) {
        this.countOperation++;
        if (isUserInit) {
            return userCalculator.multiplication(a, b);
        } else {
            return mathCalculator.multiplication(a, b);
        }
    }

    public double division(double a, double b) {
        this.countOperation++;
        if (isUserInit) {
            return userCalculator.division(a, b);
        } else {
            return mathCalculator.division(a, b);
        }
    }

    public double raiseTo(double a, int b) {
        this.countOperation++;
        if (isUserInit) {
            return userCalculator.raiseTo(a, b);
        } else {
            return mathCalculator.raiseTo(a, b);
        }
    }

    public double absolute(double a) {
        this.countOperation++;
        if (isUserInit) {
            return userCalculator.absolute(a);
        } else {
            return mathCalculator.absolute(a);
        }
    }

    public double squareRoot(double a) {
        this.countOperation++;
        if (isUserInit) {
            return userCalculator.squareRoot(a);
        } else {
            return mathCalculator.squareRoot(a);
        }
    }

}
