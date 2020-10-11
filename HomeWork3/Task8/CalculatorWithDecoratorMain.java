package HomeWork3.Task8;

import HomeWork3.Task4.CalculatorWithMathExtends;
import HomeWork3.Task6.ICalculator;

public class CalculatorWithDecoratorMain {

    public static void main(String[] args) {
        ICalculator calculator = new CalculatorWithCounterDecorator(
                new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends()));
    }
}
