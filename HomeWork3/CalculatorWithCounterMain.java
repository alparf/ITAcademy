package HomeWork3;

public class CalculatorWithCounterMain {

    public static void main(String[] args) {
        CalculatorWithCounter calculator = new CalculatorWithCounter(
                new CalculatorWithMathExtends());
        double result = calculator.summation(
                calculator.summation(4.1, calculator.multiplication(15, 7)),
                calculator.raiseTo(calculator.division(28, 5),2));
        System.out.println("value: " + result);
        System.out.println("count operation: " + calculator.getCountOperation());
    }
}
