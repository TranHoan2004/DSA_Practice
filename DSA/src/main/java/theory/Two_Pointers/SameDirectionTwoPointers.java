package theory.Two_Pointers;

import java.util.ArrayList;
import java.util.List;

/**
 * <b>Con trỏ song hành</b> (Same Direction Two Pointers) là kỹ thuật mà ở đó 2 con trỏ di chuyển từ đầu mảng,
 * tuy nhiên có 1 con trỏ chạy trước ({@code right}) và 1 con trỏ chạy sau ({@code left}).
 */
public class SameDirectionTwoPointers {
    /**
     * <b>Tìm tất cả dãy con có tổng lớn nhất không vượt quá k</b><br>
     * <ul>
     *     <li>Duyệt mảng từ đầu đến cuối</li>
     *     <li>Dùng biến sum để cộng tổng toàn bộ các phần tử. Nếu tổng vượt quá k thì sẽ loại bỏ phần từ trên đầu List. Trỏ {@code left} sẽ tăng lên để xóa tiếp phần tử tiếp theo nếu sum > k</li>
     *     <li>Mỗi lần sum được cập nhật giá trị, các phần tử của mảng mà có tổng đạt yêu cầu sẽ được thêm vào List {@code tempList}, sau đó lưu vào danh sách các List</li>
     * </ul>
     */
    private static List<List<Integer>> subArraySum(int[] arr, int k) {
        List<List<Integer>> result = new ArrayList<>();
        int left = 0, sum = 0;
        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];
            while (sum > k) {
                sum -= arr[left];
                left++;
            }
            List<Integer> tempList = new ArrayList<>();
            for (int i = left; i <= right; i++) {
                tempList.add(arr[i]);
            }
            if (!tempList.isEmpty()) {
                result.add(new ArrayList<>(tempList));
            }
        }
        return result;
    }


    public static void main(String[] args) {
        int[] a = {1, 3, 4, 2, 5, 3, 6, 4, 7, 5};
        List<List<Integer>> result = subArraySum(a, 10);
        for (List<Integer> sub : result) {
            System.out.println(sub);
        }
    }
}