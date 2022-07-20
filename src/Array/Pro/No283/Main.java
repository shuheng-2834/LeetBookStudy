package Array.Pro.No283;

import java.util.Arrays;

/**
 * @author 钟书恒
 * @ClassName Main
 * @date 2022/7/20 17:12
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        new SolutionFun1().moveZeroes(new int[]{0, 1, 0, 3, 12});
    }
}

class SolutionFun1 {
    public void moveZeroes(int[] nums) {
        if (nums == null) {
            return;
        }
        int n = nums.length - 1;
        for (int end = n; end >= 0; end--) {
            for (int i = 1; i <= end; i++) {
                if (nums[i - 1] == 0) {
                    int tmp = nums[i];
                    nums[i] = nums[i - 1];
                    nums[i - 1] = tmp;
                }
            }
        }
    }
}

class SolutionFun2 {
    public void moveZeroes(int[] nums) {
        if (nums == null) {
            return;
        }
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0 ){
                int tmp = nums[left];
                nums[left++] = nums[right];
                nums[right] = tmp;
            }
        }
    }
}
