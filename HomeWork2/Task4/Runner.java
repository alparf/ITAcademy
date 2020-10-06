package HomeWork2.Task4;

import java.util.Arrays;
import java.util.Scanner;

public class Runner {
    private static double[] firstTest = {1, 2, 3, 4, 5, 6};
    private static double[] secondTest = {1, 1, 1, 1,};
    private static double[] thirdTest = {9, 1, 5, 99, 9, 9};
    private static double[] finalTest = {};

    private static String formatLine(String line) {
        final String SPACE = " ";
        final String EXTRA_SPACE = "  ";
        while (line.contains(EXTRA_SPACE)) {
            line = line.replace(EXTRA_SPACE, SPACE);
        }
        return line.trim();
    }

    public static void main(String[] args) {
        System.out.println("Bobble Sort: ");
        System.out.print(Arrays.toString(firstTest) + " => ");
        System.out.println(Arrays.toString(Sort.bubbleSort(firstTest)));
        System.out.print(Arrays.toString(secondTest) + " => ");
        System.out.println(Arrays.toString(Sort.bubbleSort(secondTest)));
        System.out.print(Arrays.toString(thirdTest) + " => ");
        System.out.println(Arrays.toString(Sort.bubbleSort(thirdTest)));
        System.out.print(Arrays.toString(finalTest) + " => ");
        System.out.println(Arrays.toString(Sort.bubbleSort(finalTest)));

        System.out.println("Cocktail Sort: ");
        System.out.print(Arrays.toString(firstTest) + " => ");
        System.out.println(Arrays.toString(Sort.cocktailSort(firstTest)));
        System.out.print(Arrays.toString(secondTest) + " => ");
        System.out.println(Arrays.toString(Sort.cocktailSort(secondTest)));
        System.out.print(Arrays.toString(thirdTest) + " => ");
        System.out.println(Arrays.toString(Sort.cocktailSort(thirdTest)));
        System.out.print(Arrays.toString(finalTest) + " => ");
        System.out.println(Arrays.toString(Sort.cocktailSort(finalTest)));

        System.out.println("Random array:");
        int size = (int) ((Math.random() * 5) + 1);
        double[] randomArray = new double[size];
        for (int i = 0; i < size; i++) {
            randomArray[i] = Math.random() * 100;
        }
        System.out.println(Arrays.toString(randomArray));
        System.out.println("Input array elements:");
        final String SPACE = " ";
        Scanner scanner = new Scanner(System.in);
        String line = formatLine(scanner.nextLine());
        String[] splitLine = line.split(SPACE);
        double[] lineArray = new double[splitLine.length];
        for (int i = 0; i < lineArray.length; i++) {
            try {
                lineArray[i] = Double.valueOf(splitLine[i]);
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println(Arrays.toString(lineArray));
    }
}
