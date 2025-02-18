package Sort;

import java.util.Arrays;

public class InsertionSort {
    /**
     * Sorts an array of integers using the Insertion Sort algorithm.
     * This method sorts the array in-place in ascending order.
     *
     * @param a The array of integers to be sorted.
     *          The array is modified directly and does not need to be reassigned.
     */
    private static void insertionSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int key = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] a = {6, 4, 2, 8, 5, 1, 4};
        insertionSort(a);
        System.out.println(Arrays.toString(a));
    }
}
