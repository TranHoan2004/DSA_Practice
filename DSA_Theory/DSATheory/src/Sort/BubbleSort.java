package Bubble_Sort;

import java.util.Arrays;
import java.util.stream.IntStream;

public class BubbleSort {
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
        IntStream.range(0, a.length)
                .flatMap(i -> IntStream.range(0, a.length - i - 1))
                .filter(j -> a[j] > a[j + 1])
                .forEach(j -> {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                });
    }

    public static void main(String[] args) {
        int[] a = {6, 4, 2, 8, 5, 1};
        bubbleSort(a);
        System.out.println(Arrays.toString(a));
    }
}
