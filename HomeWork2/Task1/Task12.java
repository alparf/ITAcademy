package HomeWork2.Task1;

public class Task12 {
    public static void main(String[] args) {
        if (args.length > 0) {
            char[] inputNumb = args[0].toCharArray();
            StringBuilder resultToString = new StringBuilder();
            resultToString.append(inputNumb[0]);
            int result = inputNumb[0];
            for (int i = 1; i < inputNumb.length; i++){
                result *= i;
                resultToString.append(" * ").append(inputNumb[i]);
            }
            resultToString.append(" = ").append(result);
            System.out.println(resultToString);
        } else {
            System.out.println("args is empty!");
        }
    }
}
