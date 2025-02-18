package theory.Two_Pointers;

import java.util.Arrays;

public class RemoveDuplicates {
    /**
     * <b>Kỹ thuật Remove Duplicates</b>
     * <ul>
     *     <li>Đặt 2 con trỏ <b>left</b> và <b>right</b>, với <b>left</b> ặc định = 0</li>
     *     <li>Phải sắp xếp các mảng trước thì mới thực hiện được thuật toán</li>
     *     <li>
     *         Sau khi đã sắp xếp, tiến hành lọc mảng.<br>
     *         - Giống như Move Zeros, trỏ <b>right</b> sẽ chạy từ chỉ số 1 đến cuối mảng và dùng chỉ số <b>left</b> để so sánh<br>
     *         - Nếu giống nhau, bỏ qua. Nếu khác nhau, chỉ số <b>left</b> sẽ tăng lên 1 và nhận giá trị của nums[<b>right</b>] để xóa cái bị lặp đi. Cứ thế cho đến khi lọc hết mảng
     *     </li>
     * </ul>
     */
    private static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int left = 0;
        for (int right = 1; right < nums.length; right++) {
            System.out.println("=========");
            System.out.println("Right Index = " + right);
            System.out.println("Left Index = " + left);
            if (nums[right] != nums[left]) {
                System.out.println(nums[right] + "!=" + nums[left]);
                left++;
                nums[left] = nums[right];
            }
            System.out.println(Arrays.toString(nums));
        }
        return ++left;
    }

    private static void sort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 2, 4};
        sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(Arrays.copyOf(nums, removeDuplicates(nums))));
    }
}
