package Two_Pointers;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
//        int[] nums = {0, 1, 0, 3, 12};
//        int[] nums = {1, 3, 4, 5, 6};
        int[] nums = {0, 0, 0, 1};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    /**
     * <ol>
     *     <li>Đặt 2 con trỏ <b>left</b> và <b>right</b>. Tạm thời cho <b>left</b> chiếm index = 0.</li>
     *     <li>Cho mảng chạy với chỉ số của <b>right</b>.</li>
     *     <li>Đề bài yêu cầu di chuyển tất cả số 0 về cuối mảng, vì vậy ta chỉ cần di chuyển tất cả các số khác 0 về bên trái là được</li>
     *     <li>Nếu giá trị tại chỉ số của <b>right</b> khác 0, ta hoán đổi cho <b>left</b>, đồng thời tăng <b>left</b> lên 1 đơn vị (có nghĩa là <b>left</b> chỉ dịch lên khi gtr tại chỉ số <b>right</b> khác 0, còn lại <b>left</b> giữ nguyên vị trí)</li>
     *     <li>Dễ hiểu hơn, nếu gtr tại <b>right</b> khác 0, thì việc đổi chỗ nums[<b>right</b>] và nums[<b>left</b>] giống như gtr tại <b>right</b> hoán vị tại chỗ, còn 1 khi khác 0, vị trí của 0 mà <b>left</b> đang nắm thế chỗ cho vị trí cuả <b>right</b></li>
     * </ol>
     * @param nums
     */
    private static void moveZeroes(int[] nums) {
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            System.out.println("=========");
            System.out.println("The " + right + " loop");
            if (nums[right] != 0) {
                System.out.println("nums[right] != 0");
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
            System.out.println("After moving: " + Arrays.toString(nums));
        }
    }
}
