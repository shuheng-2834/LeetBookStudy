package Array.Pro.No189;

/**
 * @author 钟书恒
 * @ClassName Main
 * @date 2022/7/16 21:53
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        new Solution().rotate(new int[]{1,2,3,4,5,6,7},3);
    }
}

class Solution {
    public void rotate(int[] nums, int k) {
        // 在K有可能比数组长度大的时候，可以省去循环，直接取余数
        k %= nums.length;
        re(nums,0, nums.length-1);
        re(nums,0, k-1);
        re(nums,k, nums.length-1);
    }
    public void re(int[] nums,int left,int right){
        while (left < right){
            int n = nums[left];
            nums[left] = nums[right];
            nums[right] = n;
            left++;
            right--;
        }
    }
}