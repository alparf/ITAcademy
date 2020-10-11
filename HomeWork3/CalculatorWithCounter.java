package HomeWork3;

public class CalculatorWithCounter {
    private long countOperation;
    private CalculatorWithOperator operatorCalculator;
    private CalculatorWithMathCopy mathCalculator;
    private final CalculatorType calculatorType;

    public CalculatorWithCounter(CalculatorWithOperator calculator) {
        this.operatorCalculator = calculator;
        this.calculatorType = CalculatorType.OPERATOR;
    }

    public CalculatorWithCounter(CalculatorWithMathExtends calculator) {
        this.operatorCalculator = calculator;
        this.calculatorType = CalculatorType.OPERATOR;
    }

    public CalculatorWithCounter(CalculatorWithMathCopy calculator) {
        this.mathCalculator = calculator;
        this.calculatorType = CalculatorType.MATH;
    }

    public long getCountOperation() {
        return countOperation;
    }

    /**
     *
     * @param a first argument
     * @param b second argument
     * @return the sum of first and second argument or NaN
     */

    public double summation(double a, double b) {
        this.countOperation++;
        switch (this.calculatorType) {
            case OPERATOR: {
                return operatorCalculator.summation(a, b);
            }
            case MATH: {
                return mathCalculator.summation(a, b);
            }
            default: {
                return Double.NaN;
            }
        }
    }

    /**
     *
     * @param a first argument
     * @param b second argument
     * @return the difference of first and second argument or NaN
     */

    public double subtraction(double a, double b) {
        this.countOperation++;
        switch (this.calculatorType) {
            case OPERATOR: {
                return operatorCalculator.subtraction(a, b);
            }
            case MATH: {
                return mathCalculator.subtraction(a, b);
            }
            default: {
                return Double.NaN;
            }
        }
    }

    /**
     *
     * @param a first argument
     * @param b second argument
     * @return the multiplication result of first and second argument or NaN
     */

    public double multiplication(double a, double b) {
        this.countOperation++;
        switch (this.calculatorType) {
            case OPERATOR: {
                return operatorCalculator.multiplication(a, b);
            }
            case MATH: {
                return mathCalculator.multiplication(a, b);
            }
            default: {
                return Double.NaN;
            }
        }
    }

    /**
     *
     * @param a first argument
     * @param b second argument
     * @return the division result of first and second argument or NaN
     */

    public double division(double a, double b) {
        this.countOperation++;
        switch (this.calculatorType) {
            case OPERATOR: {
                return operatorCalculator.division(a, b);
            }
            case MATH: {
                return mathCalculator.division(a, b);
            }
            default: {
                return Double.NaN;
            }
        }
    }

    /**
     *
     * @param a first argument
     * @param b second argument
     * @return the value of the first argument raised
     * to the power of the second argument or NaN
     */

    public double raiseTo(double a, int b) {
        this.countOperation++;
        switch (this.calculatorType) {
            case OPERATOR: {
                return operatorCalculator.raiseTo(a, b);
            }
            case MATH: {
                return mathCalculator.raiseTo(a, b);
            }
            default: {
                return Double.NaN;
            }
        }
    }

    /**
     *
     * @param a argument
     * @return the absolution value of argument or NaN
     */

    public double absolute(double a) {
        this.countOperation++;
        switch (this.calculatorType) {
            case OPERATOR: {
                return operatorCalculator.absolute(a);
            }
            case MATH: {
                return mathCalculator.absolute(a);
            }
            default: {
                return Double.NaN;
            }
        }
    }

    /**
     *
     * @param a argument
     * @return the square root of argument or NaN
     */

    public double squareRoot(double a) {
        this.countOperation++;
        switch (this.calculatorType) {
            case OPERATOR: {
                return operatorCalculator.squareRoot(a);
            }
            case MATH: {
                return mathCalculator.squareRoot(a);
            }
            default: {
                return Double.NaN;
            }
        }
    }

}
