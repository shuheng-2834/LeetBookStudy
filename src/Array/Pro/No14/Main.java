package Array.Pro.No14;

/**
 * @author 钟书恒
 * @ClassName Main
 * @date 2022/7/13 14:49
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        String[] strs = new String[]{"flower", "flow", "flight"};
        System.out.println("结果：" + new Solution().longestCommonPrefix(strs));
    }
}

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        // 当前公共前缀
        int minIndex = 0;
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() <= strs[i - 1].length()) {
                minIndex = i;
            }
        }
        System.out.println(strs[minIndex]);
        String flag = strs[minIndex];
        for (String str : strs) {
            while (!str.startsWith(flag)) {
                if (flag.length() == 0) return "";
                flag = flag.substring(0, flag.length() - 1);
            }
        }
        return flag;
    }
}
