package HomeWork3;

public class CalculatorWithMemoryMain {

    public static void main(String[] args) {
        CalculatorWithMemory calculator = new CalculatorWithMemory(new CalculatorWithOperator());
        calculator.setLastValue(4.1);
        calculator.setValueInMemory();
        calculator.setLastValue(15);
        calculator.multi(7);
        calculator.sum(calculator.getValueInMemory());
        calculator.setValueInMemory();
        calculator.setLastValue(28);
        calculator.div(5);
        calculator.pow(2);
        calculator.sum(calculator.getValueInMemory());
        System.out.println(calculator.getLastValue());
    }
}
