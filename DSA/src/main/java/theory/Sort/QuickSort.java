package theory.Sort;

import java.util.Arrays;

public class QuickSort {
    private static int[] quickSort(int[] table, int first, int last) {
        int pivot;
        if (first < last) {
            pivot = partition(table, first, last);
            quickSort(table, first, pivot - 1);
            quickSort(table, pivot + 1, last);
        }
        return copyArray(table);
    }

    private static int partition(int[] table, int first, int last) {
        int pivot, pivotal;
        pivotal = table[first];  // Select the first element to make a pivot
        int i = first;
        int j = last;
        while (i < j) { // starting iterator
            while (table[i] <= pivotal && i < last) {
                i++; // a[i] > pivotal
            }
            //From left to right, if the first element >= pivot then stop
            while (table[j] > pivotal) {
                j--;  // a[j] <= pivotal
            }
            // From right to left, if the first element < pivot then stop
            if (i < j) {
                // Swap a pair of elements that have wrong positions
                int temp = table[i];
                table[i] = table[j];
                table[j] = temp;
            }
        }
        // Loop until i >= j then stop. After that, j is the new position of pivot
        // Doi cho can duoi cho phan tu o vi tri chot. Tuc la dua chot ve vi tri cua no
        int temp = table[first];
        table[first] = table[j];
        table[j] = temp;
        return j;  // Return the index of pivot into the pivot parameter
    }

    private static int[] copyArray(int[] firstArray) {
        int[] secondArray = new int[firstArray.length];
        System.arraycopy(firstArray, 0, secondArray, 0, firstArray.length);
        return secondArray;
    }

    public static void main(String[] args) {
        int[] a = {6, 4, 2, 8, 5, 1, 4};
        quickSort(a, 0, a.length);
        System.out.println(Arrays.toString(a));
    }
}
