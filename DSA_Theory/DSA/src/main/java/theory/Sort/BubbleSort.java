package Sort;

import java.util.Arrays;

public class BubbleSort {
    /**
     * Sorts an array of integers using the Bubble Sort algorithm.
     * This method implements the classic Bubble Sort algorithm, which repeatedly
     * steps through the list, compares adjacent elements and swaps them if they are in the wrong order.
     * The process is repeated until the array is sorted.
     *
     * @param a The integer array to be sorted. This array is modified in-place.
     */
    private static void bubbleSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
//        IntStream.range(0, a.length)
//                .flatMap(i -> IntStream.range(0, a.length - i - 1))
//                .filter(j -> a[j] > a[j + 1])
//                .forEach(j -> {
//                    int temp = a[j];
//                    a[j] = a[j + 1];
//                    a[j + 1] = temp;
//                });
    }

    public static void main(String[] args) {
        int[] a = {6, 4, 2, 8, 5, 1};
        bubbleSort(a);
        System.out.println(Arrays.toString(a));
    }
}
