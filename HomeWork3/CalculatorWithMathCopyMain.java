package HomeWork3;

public class CalculatorWithMathCopyMain {

    public static void main(String[] args) {
        CalculatorWithMathCopy calculator = new CalculatorWithMathCopy();
        double result = calculator.summation(
                calculator.summation(4.1, calculator.multiplication(15, 7)),
                calculator.raiseTo(calculator.division(28, 5),2));
        System.out.println("value: " + result);
    }
}
