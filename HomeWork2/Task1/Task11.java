package HomeWork2.Task1;

public class Task11 {
    public static void main(String[] args) {
        if (args.length > 0) {
            int inputNumb = Integer.valueOf(args[0]);
            int result = 1;
            StringBuilder resultToString = new StringBuilder("1");
            for (int i = 2; i <= inputNumb; i++) {
                result = result * i;
                resultToString.append(" * ").append(i);
            }
            resultToString.append(" = ").append(result);
            System.out.println(resultToString);
        } else {
            System.out.println("args is empty!");
        }
    }
}
