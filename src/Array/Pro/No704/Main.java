package Array.Pro.No704;

/**
 * @author 钟书恒
 * @ClassName Main
 * @date 2022/7/15 21:28
 * @Version 1.0
 *
 * 二分法
 */
public class Main {
}

class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            // 避免数据量过多溢出
            int mid = (right - left) / 2 + left;
            if (target == nums[mid]) {
                return mid;
            } else if (target > nums[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
