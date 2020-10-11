package HomeWork3.Task3;

public class CalculatorWithMathCopyMain {

    public static void main(String[] args) {
        CalculatorWithMathCopy calculator = new CalculatorWithMathCopy();
        double result = calculator.sum(
                calculator.sum(4.1, calculator.multi(15, 7)),
                calculator.pow(calculator.div(28, 5),2));
        System.out.println("value: " + result);
    }
}
