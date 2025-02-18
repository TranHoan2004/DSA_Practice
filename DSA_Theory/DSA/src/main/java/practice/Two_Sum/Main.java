package Two_Sum;

import java.util.Arrays;

public class Main {
    /**
     * <ul>
     *  <li>
     *      Given an array of integers {@code nums} and an integer {@code   target},
     *      return indices of * the two numbers such that they add up to
     *      {@code target}.<br/>
     *      You may assume that each input would have exactly one solution, and you * may
     *      not use the same element twice.<br/>
     *      You can return the answer in any order.
     *  </li>
     *  <li>
     *      For Examples: <br/>
     *      Input: nums = [2,7,11,15], target = 9<br/>
     *      Output: [0,1]
     *  </li>
     *  <li>
     *      Constraints:<br/>
     *      2 <= nums.length <= 10^4
     *      -10^9 <= nums[i] <= 10^9
     *      -10^9 <= target <= 10^9
     *  </li>
     * </ul>
     */
    public static void main(String[] args) {
        int target = 6;
        // long[] nums = {2, 7, 11, 15};
//        int[] nums = {3, 2, 4};
        int[] nums = {2, 4, 11, 3};
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    // brute force algorithm
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
}
