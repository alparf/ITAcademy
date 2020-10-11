package HomeWork3.Task5;

import HomeWork3.Task4.CalculatorWithMathExtends;

public class CalculatorWithCounterMain {

    public static void main(String[] args) {
        CalculatorWithCounter calculator = new CalculatorWithCounter(
                new CalculatorWithMathExtends());
        double result = calculator.sum(
                calculator.sum(4.1, calculator.multi(15, 7)),
                calculator.pow(calculator.div(28, 5),2));
        System.out.println("value: " + result);
        System.out.println("count operation: " + calculator.getCountOperation());
    }
}
