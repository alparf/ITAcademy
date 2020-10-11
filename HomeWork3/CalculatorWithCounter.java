package HomeWork3;

import static HomeWork3.CalculatorType.OPERATOR;

public class CalculatorWithCounter {
    private long countOperation;
    private CalculatorWithOperator operatorCalculator;
    private CalculatorWithMathCopy mathCalculator;
    private final CalculatorType calculatorType;

    public CalculatorWithCounter(CalculatorWithOperator calculator) {
        this.operatorCalculator = calculator;
        this.calculatorType = OPERATOR;
    }

    public CalculatorWithCounter(CalculatorWithMathExtends calculator) {
        this.operatorCalculator = calculator;
        this.calculatorType = OPERATOR;
    }

    public CalculatorWithCounter(CalculatorWithMathCopy calculator) {
        this.mathCalculator = calculator;
        this.calculatorType = CalculatorType.MATH;
    }

    public long getCountOperation() {
        return countOperation;
    }

    public double summation(double a, double b) {
        this.countOperation++;
        if (this.calculatorType == OPERATOR) {
            return this.operatorCalculator.summation(a, b);
        }
        return this.mathCalculator.summation(a, b);
    }

    public double subtraction(double a, double b) {
        this.countOperation++;
        if (this.calculatorType == OPERATOR) {
            return this.operatorCalculator.subtraction(a, b);
        }
        return this.mathCalculator.subtraction(a, b);
    }

    public double multiplication(double a, double b) {
        this.countOperation++;
        if (this.calculatorType == OPERATOR) {
            return this.operatorCalculator.multiplication(a, b);
        }
        return this.mathCalculator.multiplication(a, b);
    }

    public double division(double a, double b) {
        this.countOperation++;
        if (this.calculatorType == OPERATOR) {
            return this.operatorCalculator.division(a, b);
        }
        return this.mathCalculator.division(a, b);
    }

    public double raiseTo(double a, int b) {
        this.countOperation++;
        if (this.calculatorType == OPERATOR) {
            return this.operatorCalculator.raiseTo(a, b);
        }
        return this.mathCalculator.raiseTo(a, b);
    }

    public double absolute(double a) {
        this.countOperation++;
        if (this.calculatorType == OPERATOR) {
            return this.operatorCalculator.absolute(a);
        }
        return this.mathCalculator.absolute(a);
    }

    public double squareRoot(double a) {
        this.countOperation++;
        if (this.calculatorType == OPERATOR) {
            return this.operatorCalculator.squareRoot(a);
        }
        return this.mathCalculator.squareRoot(a);
    }
}
