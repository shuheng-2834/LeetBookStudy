package BilibiliVideoStudy.CodeP7;

import BilibiliVideoStudy.Util.UtilTools;

/**
 * @author 钟书恒
 * @ClassName SelectionSort
 * @date 2022/7/17 16:25
 * @Version 1.0
 * <p>
 * 选择排序
 */
public class Sort {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 3, 43, 234, 123, 4, 5, 67};
        UtilTools.print(nums);
        insertSortFun2(nums);
        UtilTools.print(nums);
    }

    /**
     * 选择排序
     * 先选出最小的一个数字，将其与第一位进行交往，重复该过程
     *
     * @param nums 要排序的数组
     */
    public static void selectionSort(int[] nums) {
        if (UtilTools.isArrayNUll(nums)) {
            return;
        }
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                minIndex = nums[j] < nums[minIndex] ? j : minIndex;
            }
            UtilTools.swap(nums, i, minIndex);
        }
    }

    /**
     * 冒泡排序
     * 两两比较，将比较大的数字逐渐升到最后一位
     *
     * @param nums
     */
    public static void bubbleSort(int[] nums) {
        if (UtilTools.isArrayNUll(nums)) {
            return;
        }
        int n = nums.length;
        for (int end = n - 1; end >= 0; end--) {
            for (int second = 1; second <= end; second++) {
                if (nums[second - 1] > nums[second]) {
                    UtilTools.swap(nums, second - 1, second);
                }
            }
        }
    }

    /**
     * 插入排序
     *
     * @param nums
     */
    public static void insertSortFun1(int[] nums) {
        int n = nums.length;
        for (int end = 1; end < n; end++) {
            int j = end;
            while (j - 1 >= 0 && nums[j] < nums[j - 1]) {
                UtilTools.swap(nums, j, j - 1);
                j--;
            }
        }
    }

    /**
     * 插入排序(优化版本)
     *
     * @param nums
     */
    public static void insertSortFun2(int[] nums) {
        int n = nums.length;
        for (int end = 1; end < n; end++) {
            for (int pre = end - 1; pre >= 0 && nums[pre] > nums[pre+1]; pre--) {
                UtilTools.swap(nums, pre, pre+1);
            }
        }
    }

}
