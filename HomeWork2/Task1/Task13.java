package HomeWork2.Task1;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input number: ");
        double numb = scanner.nextDouble();
        System.out.println("input degree: ");
        int degree = scanner.nextInt();
        if (degree > 0) {
            double result = numb;
            for(int i = 1; i < degree; i++ ) {
                result *= numb;
            }
            System.out.println("Result: " + result);
        } else {
            System.out.println("Degree must to be > 0");
        }
    }
}
