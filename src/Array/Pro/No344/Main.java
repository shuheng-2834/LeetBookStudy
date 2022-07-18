package Array.Pro.No344;

/**
 * @author 钟书恒
 * @ClassName Main
 * @date 2022/7/18 21:13
 * @Version 1.0
 *
 * 反转字符串
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution());
    }
}

class Solution {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length-1;

        while (left < right){
            char tmp = s[left];
            s[left] = s[right];
            s[right] = tmp;
            left++;
            right--;
        }
    }
}