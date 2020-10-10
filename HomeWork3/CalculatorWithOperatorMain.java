package HomeWork3;

public class CalculatorWithOperatorMain {
    public static void main(String[] args) {
        CalculatorWithOperator calculator = new CalculatorWithOperator();
        double result = calculator.summation(
                calculator.summation(4.1, calculator.multiplication(15, 7)),
                calculator.raiseTo(calculator.division(28, 5),2));
        System.out.println("value: " + result);
    }
}
