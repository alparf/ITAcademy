package HomeWork3;

public class CalculatorWithMemoryMain {
    public static void main(String[] args) {
        CalculatorWithMemory calculator = new CalculatorWithMemory(new CalculatorWithOperator());
        calculator.setLastValue(4.1);
        calculator.setValueInMemory();
        calculator.setLastValue(15);
        calculator.multiplication(7);
        calculator.summation(calculator.getValueInMemory());
        calculator.setValueInMemory();
        calculator.setLastValue(28);
        calculator.division(5);
        calculator.raiseTo(2);
        calculator.summation(calculator.getValueInMemory());
        System.out.println(calculator.getLastValue());
    }
}
