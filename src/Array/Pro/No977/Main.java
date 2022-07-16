package Array.Pro.No977;

import java.util.Arrays;

/**
 * @author 钟书恒
 * @ClassName Main
 * @date 2022/7/16 21:20
 * @Version 1.0
 *
 * 双指针
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().sortedSquares(new int[]{-4, -1, 0, 3, 10})));
    }
}

class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0, right = nums.length - 1;
        int[] result = new int[nums.length];
        int index = result.length - 1;
        while (left <= right) {
            if (nums[left] * nums[left] > nums[right] * nums[right]) {
                result[index--] = nums[left] * nums[left];
                left++;
            } else {
                result[index--] = nums[right] * nums[right];
                right--;
            }
        }
        return result;
    }
}