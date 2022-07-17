package BilibiliVideoStudy.Util;

import java.util.Arrays;

/**
 * @author 钟书恒
 * @ClassName UtilTools
 * @date 2022/7/17 16:48
 * @Version 1.0
 */
public class UtilTools {
    /**
     *
     * @param nums 交换的数组
     * @param i 下标1
     * @param j 下标2
     */
    public static void swap(int[] nums,int i,int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    /**
     *
     * @param nums 要打印的数组
     */
    public static void print(int[] nums) {
        System.out.println(Arrays.toString(nums));
    }

    public static boolean isArrayNUll(int[] nums){
        if (nums == null || nums.length < 2) {
            return true;
        }else{
            return false;
        }
    }
}
