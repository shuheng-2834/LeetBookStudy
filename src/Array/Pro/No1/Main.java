package Array.Pro.No1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 钟书恒
 * @ClassName Main
 * @date 2022/7/9 21:34
 * @Version 1.0
 *
 * 两数之和
 *
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 *
 * 你可以按任意顺序返回答案。
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().twoSum(new int[]{2, 7, 11, 15}, 9)));
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int begin = 0;
        int end = nums.length;
        for (int i = 0; i < nums.length; i++) {
            for (int i1 = i + 1; i1 < nums.length; i1++) {
                if (nums[i] + nums[i1] == target) {
                    return new int[]{i, i1};
                }
            }
        }
        return nums;
    }
}