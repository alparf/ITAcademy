package HomeWork3.Task8;

import HomeWork3.Task4.CalculatorWithMathExtends;
import HomeWork3.Task6.ICalculator;

public class CalculatorWithDecoratorMain {

    public static void main(String[] args) {
        CalculatorWithMathExtends calcWithMathExtends = new CalculatorWithMathExtends();
        CalculatorWithMemoryDecorator memoryDecorator = new CalculatorWithMemoryDecorator(calcWithMathExtends);
        CalculatorWithCounterDecorator counterDecorator = new CalculatorWithCounterDecorator(memoryDecorator);
        ICalculator calculator = counterDecorator;
        memoryDecorator.setLastValue(4.1);
        memoryDecorator.setValueInMemory();
        calculator.multi(15,7);
        calculator.sum(memoryDecorator.getLastValue(), memoryDecorator.getValueInMemory());
        memoryDecorator.setValueInMemory();
        calculator.div(28, 5);
        calculator.pow(memoryDecorator.getLastValue(), 2);
        calculator.sum(memoryDecorator.getLastValue(),memoryDecorator.getValueInMemory());
        System.out.println("value: " + memoryDecorator.getLastValue());
        System.out.println("last value in memory: " + memoryDecorator.getValueInMemory());
        System.out.println("count operation: " + counterDecorator.getCountOperation());
    }
}
