package Array.Pro.No9;

/**
 * @author 钟书恒
 * @ClassName Main
 * @date 2022/7/10 11:11
 * @Version 1.0
 *
 * 判断是否为回文数
 */
public class Main {
    public static void main(String[] args) {
        System.out.printf(new Solution().isPalindrome(121) ?"true":"false");
    }
}

class Solution {
    public boolean isPalindrome(int x) {
        // 如果数字是负数或者以0结尾则直接返回false,
        if (x < 0 || x % 10 == 0 && x != 0) {
            return false;
        }
        int reNum = 0;
        // 反转半边，
        while (x > reNum) {
            reNum = reNum * 10 + x % 10;
            x /= 10;
        }
        return reNum == x || reNum / 10 == x;
    }
}