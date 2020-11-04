package HomeWork2.Task4;

import java.util.Arrays;
import java.util.Comparator;

public class Sort {

    private static <T> void swap(T[] array, int firstIndex, int secondIndex) {
        T buffer = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = buffer;
    }

    private static void swap(double[] array, int firstIndex, int secondIndex) {
        double buffer = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = buffer;
    }

    public static <T extends Comparable> T[] cocktailSort(T[] array) {
        int size = array.length;
        int leftIndex = 0;
        int rightIndex = size - 1;
        do {
            for (int i = leftIndex; i < rightIndex; i++) {
                if (array[i].compareTo(array[i + 1]) > 0) {
                    swap(array, i, i + 1);
                }
            }
            rightIndex--;
            for (int i = rightIndex; i > leftIndex; i--) {
                if (array[i].compareTo(array[i - 1]) < 0) {
                    swap(array, i, i - 1);
                }
            }
            leftIndex++;
        } while (leftIndex <= rightIndex);
        return array;
    }

    public static <T> void cocktailSort(T[] array, Comparator<T> comparator) {
        int size = array.length;
        int leftIndex = 0;
        int rightIndex = size - 1;
        do {
            for (int i = leftIndex; i < rightIndex; i++) {
                if (comparator.compare(array[i], array[i + 1]) > 0) {
                    swap(array, i, i + 1);
                }
            }
            rightIndex--;
            for (int i = rightIndex; i > leftIndex; i--) {
                if (comparator.compare(array[i], array[i - 1]) < 0) {
                    swap(array, i, i - 1);
                }
            }
            leftIndex++;
        } while (leftIndex <= rightIndex);
    }

    public static double[] bubbleSort(double[] array) {
        int size = array.length;
        double[] sortedArray = Arrays.copyOf(array, size);
        boolean isChange;
        for( int n = 1; n < size; n ++) {
            isChange = false;
            for (int i = 0; i < size - 1; i++) {
                if (sortedArray[i] > sortedArray[i + 1]) {
                    swap(sortedArray, i, i + 1);
                    isChange = true;
                }
            }
            if (!isChange) {
                break;
            }
        }
        return sortedArray;
    }

    public static double[] cocktailSort(double[] array) {
        Double doubleArray[] = new Double[array.length];
        for (int i = 0; i < array.length; i++) {
            doubleArray[i] = Double.valueOf(array[i]);
        }
        cocktailSort(doubleArray);
        for (int i = 0; i < array.length; i++) {
            array[i] = doubleArray[i];
        }
        return array;
    }
}