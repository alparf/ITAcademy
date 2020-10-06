package HomeWork2;

import java.util.Scanner;

public class Task2 {
    private static final String SPACE = " ";
    private static final String EXTRA_SPACE = "  ";

    private static String formatLine(String line) {
        while (line.contains(EXTRA_SPACE)) {
            line = line.replace(EXTRA_SPACE, SPACE);
        }
        return line.trim();
    }

    private static void printNumbs(double[] numbs) {
        System.out.println("Print do ...while:");
        int index = 0;
        final int LENGTH = numbs.length;
        do {
            System.out.print(numbs[index] + "\t");
            index++;
        } while (index < LENGTH);
        System.out.println("\nPrint while:");
        index = 0;
        while (index < LENGTH) {
            System.out.print(numbs[index] + "\t");
            index++;
        }
        System.out.println("\nPrint for:");
        for (int i = 0; i < LENGTH; i++) {
            System.out.print(numbs[i] + "\t");
        }
        System.out.println("\nPrint foreach:");
        for (double numb: numbs) {
            System.out.print(numb + "\t");
        }
    }

    private static void printNumbsRevert(double[] numbs) {
        System.out.println("Print do ...while:");
        final int LENGTH = numbs.length;
        int index = LENGTH - 1;
        do {
            System.out.print(numbs[index] + "\t");
            index--;
        } while (index >= 0);
        System.out.println("\nPrint while:");
        index = LENGTH - 1;
        while (index >= 0) {
            System.out.print(numbs[index] + "\t");
            index--;
        }
        System.out.println("\nPrint for:");
        for (int i = LENGTH - 1; i >= 0; i--) {
            System.out.print(numbs[i] + "\t");
        }
        System.out.println("\nPrint foreach:");
        double[] revertNumbs = new double[LENGTH];
        index = 0;
        for (double numb: numbs) {
            revertNumbs[LENGTH - index - 1] = numb;
            index++;
        }
        for (double numb: revertNumbs) {
            System.out.print(numb + "\t");
        }
    }

    public static void main(String[] args) {
        final String NUMBER_FORMAT = " have to be number ";
        Scanner scanner = new Scanner(System.in);
        String numbsLine = formatLine(scanner.nextLine());
        String[] lineArray = numbsLine.split(SPACE);
        double[] numbs = new double[lineArray.length];
        for (int i = 0; i < lineArray.length; i++) {
            try {
                numbs[i] = Double.valueOf(lineArray[i]);
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage() + NUMBER_FORMAT);
            }
        }
        printNumbs(numbs);
        System.out.println("\n\nPrint in one:");
        for (int i = 0; i < numbs.length; i += 2) {
            System.out.print(numbs[i]  + "\t");
        }
        System.out.println("\n\nRevert");
        printNumbsRevert(numbs);
    }
}
