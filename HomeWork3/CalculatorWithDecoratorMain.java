package HomeWork3;

public class CalculatorWithDecoratorMain {

    public static void main(String[] args) {
        ICalculator calculator = new CalculatorWithCounterDecorator(
                new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends()));
    }
}
