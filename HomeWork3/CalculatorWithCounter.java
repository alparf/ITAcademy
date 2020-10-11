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

    public double sum(double a, double b) {
        this.countOperation++;
        if (this.calculatorType == OPERATOR) {
            return this.operatorCalculator.sum(a, b);
        }
        return this.mathCalculator.sum(a, b);
    }

    public double sub(double a, double b) {
        this.countOperation++;
        if (this.calculatorType == OPERATOR) {
            return this.operatorCalculator.sub(a, b);
        }
        return this.mathCalculator.sub(a, b);
    }

    public double multi(double a, double b) {
        this.countOperation++;
        if (this.calculatorType == OPERATOR) {
            return this.operatorCalculator.multi(a, b);
        }
        return this.mathCalculator.multi(a, b);
    }

    public double div(double a, double b) {
        this.countOperation++;
        if (this.calculatorType == OPERATOR) {
            return this.operatorCalculator.div(a, b);
        }
        return this.mathCalculator.div(a, b);
    }

    public double pow(double a, int b) {
        this.countOperation++;
        if (this.calculatorType == OPERATOR) {
            return this.operatorCalculator.pow(a, b);
        }
        return this.mathCalculator.pow(a, b);
    }

    public double abs(double a) {
        this.countOperation++;
        if (this.calculatorType == OPERATOR) {
            return this.operatorCalculator.abs(a);
        }
        return this.mathCalculator.abs(a);
    }

    public double sqr(double a) {
        this.countOperation++;
        if (this.calculatorType == OPERATOR) {
            return this.operatorCalculator.sqr(a);
        }
        return this.mathCalculator.sqr(a);
    }
}
