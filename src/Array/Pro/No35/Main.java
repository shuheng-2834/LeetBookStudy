package Array.Pro.No35;

/**
 * @author 钟书恒
 * @ClassName Main
 * @date 2022/7/15 22:29
 * @Version 1.0
 * <p>
 * 加强版二分法
 * 二分法主要是对于边界的处理问题上
 */
public class Main {
}

class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;

        // 定义target在左闭右闭的区间，[low, high]
        int low = 0;
        int high = n - 1;

        // 当low==high，区间[low, high]依然有效
        while (low <= high) {
            // 防止溢出，等同于相加除以二
            int mid = low + (high - low) / 2;
            if (nums[mid] > target) {
                // target 在左区间，所以[low, mid - 1]
                high = mid - 1;
            } else if (nums[mid] < target) {
                // target 在右区间，所以[mid + 1, high]
                low = mid + 1;
            } else {
                // 1. 目标值等于数组中某一个元素  return mid;
                return mid;
            }
        }
        // 2.目标值在数组所有元素之前 3.目标值插入数组中 4.目标值在数组所有元素之后 return right + 1;
        return high + 1;
    }
}
