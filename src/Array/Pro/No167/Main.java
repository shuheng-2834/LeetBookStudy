package Array.Pro.No167;

/**
 * @author 钟书恒
 * @ClassName Main
 * @date 2022/7/23 21:06
 * @Version 1.0
 *
 * 167. 两数之和 II - 输入有序数组
 */
public class Main {
    public static void main(String[] args) {

    }
}

/**
 * 直接遍历法
 */
class SolutionFun1 {
    public int[] twoSum(int[] numbers, int target) {
        if (numbers.length == 0) {
            return null;
        }
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    return new int[]{i + 1, j + 1};
                }
            }
        }
        return numbers;
    }
}

/**
 *双指针法
 */
class SolutionFun2 {
    public int[] twoSum(int[] numbers, int target) {
        if (numbers.length == 0) {
            return null;
        }
        int sum = 0;
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[]{left + 1, right + 1};
            } else if (sum > target) {
                right--;
            } else {
                left++;
            }
        }
        return null;
    }
}