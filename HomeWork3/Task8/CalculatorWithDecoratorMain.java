package HomeWork3.Task8;

import HomeWork3.Task4.CalculatorWithMathExtends;
import HomeWork3.Task6.ICalculator;

public class CalculatorWithDecoratorMain {

    public static void main(String[] args) {
        ICalculator calculator = new CalculatorWithCounterDecorator(
                new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends()));
        double result = calculator.sum(
                calculator.sum(4.1, calculator.multi(15, 7)),
                calculator.pow(calculator.div(28, 5),2));
        System.out.println("value: " + result);
    }
}
