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

    private static void printNumbs(double[] numbs) {
        System.out.println("Print do ...while:");
        int index = 0;
        final int LENGTH = numbs.length;
        do {
            System.out.println(numbs[index]);
            index++;
        } while (index < LENGTH);
        System.out.println("\nPrint while:");
        index = 0;
        while (index < LENGTH) {
            System.out.println(numbs[index]);
            index++;
        }
        System.out.println("\nPrint for:");
        for (int i = 0; i < LENGTH; i++) {
            System.out.println(numbs[i]);
        }
        System.out.println("\nPrint foreach:");
        for (double numb: numbs) {
            System.out.println(numb);
        }
    }

    private static void printNumbsRevert(double[] numbs) {
        System.out.println("Print do ...while:");
        final int LENGTH = numbs.length;
        int index = LENGTH - 1;
        do {
            System.out.println(numbs[index]);
            index--;
        } while (index >= 0);
        System.out.println("\nPrint while:");
        index = LENGTH - 1;
        while (index >= 0) {
            System.out.println(numbs[index]);
            index--;
        }
        System.out.println("\nPrint for:");
        for (int i = LENGTH - 1; i >= 0; i--) {
            System.out.println(numbs[i]);
        }
        System.out.println("\nPrint foreach:");
        double[] revertNumbs = new double[LENGTH];
        index = 0;
        for (double numb: numbs) {
            revertNumbs[LENGTH - index - 1] = numb;
            index++;
        }
        for (double numb: revertNumbs) {
            System.out.println(numb);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numbsLine = formatLine(scanner.nextLine());
        String[] lineArray = numbsLine.split(SPACE);
        double[] numbs = new double[lineArray.length];
        for (int i = 0; i < lineArray.length; i++) {
            numbs[i] = Double.valueOf(lineArray[i]);
        }
        printNumbs(numbs);
        System.out.println("\nPrint in one:");
        for (int i = 0; i < numbs.length; i += 2) {
            System.out.println(numbs[i]);
        }
        System.out.println("\nRevert");
        printNumbsRevert(numbs);
    }
}
