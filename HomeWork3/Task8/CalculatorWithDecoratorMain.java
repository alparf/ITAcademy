package HomeWork3.Task8;

import HomeWork3.Task4.CalculatorWithMathExtends;
import HomeWork3.Task6.ICalculator;

public class CalculatorWithDecoratorMain {

    public static void main(String[] args) {
        ICalculator calculator = new CalculatorWithCounterDecorator(
                new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends()));
        if(calculator instanceof CalculatorWithCounterDecorator &&
                ((CalculatorWithCounterDecorator) calculator)
                        .getCalculator() instanceof CalculatorWithMemoryDecorator) {
            CalculatorWithMemoryDecorator memory =
                    (CalculatorWithMemoryDecorator) ((CalculatorWithCounterDecorator) calculator).getCalculator();
            memory.setLastValue(4.1);
            memory.getValueInMemory();
            calculator.multi(15,7);
            calculator.sum(memory.getLastValue(), memory.getValueInMemory());
            memory.setValueInMemory();
            calculator.div(28, 5);
            calculator.pow(memory.getLastValue(), 2);
            calculator.sum(memory.getLastValue(),memory.getValueInMemory());
            System.out.println("value: " + memory.getLastValue());
            System.out.println("last value in memory: " + memory.getValueInMemory());
            System.out.println("count operation: " + ((CalculatorWithCounterDecorator) calculator)
                    .getCountOperation());
        }
    }
}
