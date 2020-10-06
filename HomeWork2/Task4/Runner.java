package HomeWork2.Task4;

import java.util.Arrays;

public class Runner {
    private static final double[] FIRST_TEST = {1, 2, 3, 4, 5, 6};
    private static final double[] SECOND_TEST = {1, 1, 1, 1,};
    private static final double[] THIRD_TEST = {9, 1, 5, 99, 9, 9};
    private static final double[] FINAL_TEST = {};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(FIRST_TEST));
        System.out.println(Arrays.toString(Sort.bubbleSort(FIRST_TEST)));
        System.out.println(Arrays.toString(SECOND_TEST));
        System.out.println(Arrays.toString(Sort.bubbleSort(SECOND_TEST)));
        System.out.println(Arrays.toString(THIRD_TEST));
        System.out.println(Arrays.toString(Sort.bubbleSort(THIRD_TEST)));
        System.out.println(Arrays.toString(FINAL_TEST));
        System.out.println(Arrays.toString(Sort.bubbleSort(FINAL_TEST)));

        System.out.println(Arrays.toString(FIRST_TEST));
        System.out.println(Arrays.toString(Sort.cocktailSort(FIRST_TEST)));
        System.out.println(Arrays.toString(SECOND_TEST));
        System.out.println(Arrays.toString(Sort.cocktailSort(SECOND_TEST)));
        System.out.println(Arrays.toString(THIRD_TEST));
        System.out.println(Arrays.toString(Sort.cocktailSort(THIRD_TEST)));
        System.out.println(Arrays.toString(FINAL_TEST));
        System.out.println(Arrays.toString(Sort.cocktailSort(FINAL_TEST)));
    }
}
