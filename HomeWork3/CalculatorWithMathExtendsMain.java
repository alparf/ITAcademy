package HomeWork3;

public class CalculatorWithMathExtendsMain {

    public static void main(String[] args) {
        CalculatorWithOperator calculator = new CalculatorWithMathExtends();
        double result = calculator.sum(
                calculator.sum(4.1, calculator.multi(15, 7)),
                calculator.pow(calculator.div(28, 5),2));
        System.out.println("value: " + result);
    }
}
