package HomeWork3;

public class CalculatorWithCounter {
    private long countOperation;
    private CalculatorWithOperator operatorCalculator;
    private CalculatorWithMathCopy mathCalculator;
    private boolean isWithOperatorLock;

    public CalculatorWithCounter(CalculatorWithOperator calculator) {
        this.operatorCalculator = calculator;
        this.isWithOperatorLock = false;
    }

    public CalculatorWithCounter(CalculatorWithMathExtends calculator) {
        this.operatorCalculator = calculator;
        this.isWithOperatorLock = false;
    }

    public CalculatorWithCounter(CalculatorWithMathCopy calculator) {
        this.mathCalculator = calculator;
        this.isWithOperatorLock = true;
    }

    public long getCountOperation() {
        return countOperation;
    }

    public double summation(double a, double b) {
        this.countOperation++;
        if (!isWithOperatorLock) {
            return operatorCalculator.summation(a, b);
        }
        return mathCalculator.summation(a, b);
    }

    public double subtraction(double a, double b) {
        this.countOperation++;
        if (!isWithOperatorLock) {
            return operatorCalculator.subtraction(a, b);
        }
        return mathCalculator.subtraction(a, b);
    }

    public double multiplication(double a, double b) {
        this.countOperation++;
        if (!isWithOperatorLock) {
            return operatorCalculator.multiplication(a, b);
        }
        return mathCalculator.multiplication(a, b);
    }

    public double division(double a, double b) {
        this.countOperation++;
        if (!isWithOperatorLock) {
            return operatorCalculator.division(a, b);
        }
        return mathCalculator.division(a, b);
    }

    public double raiseTo(double a, int b) {
        this.countOperation++;
        if (!isWithOperatorLock) {
            return operatorCalculator.raiseTo(a, b);
        }
        return mathCalculator.raiseTo(a, b);
    }

    public double absolute(double a) {
        this.countOperation++;
        if (!isWithOperatorLock) {
            return operatorCalculator.absolute(a);
        }
        return mathCalculator.absolute(a);
    }

    public double squareRoot(double a) {
        this.countOperation++;
        if (!isWithOperatorLock) {
            return operatorCalculator.squareRoot(a);
        }
        return mathCalculator.squareRoot(a);
    }

}
