package HomeWork2;

import java.util.Scanner;

public class Task2 {
    private static final String SPACE = " ";
    private static final String EXTRA_SPACE = "  ";

    private static String formatLine(String line) {
        while (line.contains(EXTRA_SPACE)) {
            String replaceLine = line.replace(EXTRA_SPACE, SPACE);
            line = replaceLine;
        }
        return line.trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numbsLine = formatLine(scanner.nextLine());
        String[] lineArray = numbsLine.split(SPACE);
        double[] numbs = new double[lineArray.length];
        for (int i = 0; i < lineArray.length; i++) {
            numbs[i] = Double.valueOf(lineArray[i]);
        }
        System.out.println("Print do ...while:");
        int index = 0;
        do {
            System.out.println(numbs[index]);
            index++;
        } while (index < numbs.length);
        System.out.println("\nPrint while:");
        index = 0;
        while (index < numbs.length) {
            System.out.println(numbs[index]);
            index++;
        }
        System.out.println("\nPrint for:");
        for (int i = 0; i < numbs.length; i++) {
            System.out.println(numbs[i]);
        }
        System.out.println("\nPrint foreach:");
        for (double numb: numbs) {
            System.out.println(numb);
        }
    }
}
