package Array.Pro.No557;

import java.util.Arrays;

/**
 * @author 钟书恒
 * @ClassName Main
 * @date 2022/7/18 21:18
 * @Version 1.0
 * <p>
 * 反转字符串中的单词 III
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().reverseWords("Let's take LeetCode contest"));
    }
}

class Solution {
    public String reverseWords(String s) {
        String[] arrayString = s.split(" ");
        StringBuilder returnString = new StringBuilder(new String(""));
        for (String s1 : arrayString) {
            char[] charString = s1.toCharArray();
            int left = 0;
            int right = charString.length-1;
            while (left < right) {
                char tmp = charString[left];
                charString[left] = charString[right];
                charString[right] = tmp;
                left++;
                right--;
            }
            returnString.append(String.valueOf(charString)).append(" ");
        }
        return returnString.toString().substring(0, returnString.toString().length() - 1);
    }
}
