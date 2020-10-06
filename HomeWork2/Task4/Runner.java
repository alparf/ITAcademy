package HomeWork2.Task4;

import java.util.Arrays;

public class Runner {
    private static double[] firstTest = {1, 2, 3, 4, 5, 6};
    private static double[] secondTest = {1, 1, 1, 1,};
    private static double[] thirdTest = {9, 1, 5, 99, 9, 9};
    private static double[] finalTest = {};

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
    }
}
