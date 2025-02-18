package theory.Sort;

import java.util.Arrays;

public class SelectionSort {
    /**
     * Sorts an array of integers using the Selection Sort algorithm.
     * This method modifies the input array in-place, arranging the elements
     * in ascending order.
     *
     * @param nums The array of integers to be sorted.
     *             This array is modified directly by the method.
     */
    private static void selectionSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int[] a = {6, 4, 2, 8, 5, 1, 4};
        selectionSort(a);
        System.out.println(Arrays.toString(a));
    }
}
