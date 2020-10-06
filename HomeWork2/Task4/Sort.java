package HomeWork2.Task4;

import java.util.Arrays;

public class Sort {

    public static double[] bubbleSort(double[] array) {
        int size = array.length;
        double[] sortedArray = Arrays.copyOf(array, size);
        double buffer;
        boolean isChange;
        for( int n = 1; n < size; n ++) {
            isChange = false;
            for (int i = 0; i < size - 1; i++) {
                if (sortedArray[i] > sortedArray[i + 1]) {
                    buffer = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = buffer;
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
        int size = array.length;
        double[] sortedArray = Arrays.copyOf(array, size);
        int leftIndex = 0;
        int rightIndex = size - 1;
        double buffer;
        for (int i = leftIndex; i < rightIndex; i++) {
            if(sortedArray[i] > sortedArray[i + 1]) {
                buffer = sortedArray[i];
                sortedArray[i] = sortedArray[i + 1];
                sortedArray[i + 1] = buffer;
            }
        }
        rightIndex--;
        for (int i = rightIndex; i > leftIndex; i--) {
            if(sortedArray[i] < sortedArray[i - 1]) {
                buffer = sortedArray[i];
                sortedArray[i] = sortedArray[i - 1];
                sortedArray[i - 1] = buffer;
            }
        }
        leftIndex++;
        return sortedArray;
    }
}