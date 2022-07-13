package Array.Pro.No14;

/**
 * @author 钟书恒
 * @ClassName Main
 * @date 2022/7/13 14:49
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        String[] strs = new String[]{"flower", "flower","flower"};
        System.out.println("结果：" + new Solution().longestCommonPrefix(strs));
    }
}

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1){
            return strs[0];
        }
        // 当前公共前缀
        String flag = "";
        String flag1 = "";
        // 当前字符串
        String str = strs[0];
        // 下一个字符串
        String next = "";
        for (int i = 0; i < strs.length - 1; i++) {
            if (i == 0) {
                str = strs[i];
            } else {
                str = flag1;
            }
            for (int j = 0; j <= str.length(); j++) {
                flag = str.substring(0, j);
                next = strs[i + 1];
                System.out.println(flag);
                if (next.length() >= j) {
                    if (flag.equals(strs[i + 1].substring(0, j))) {
                        flag1 = flag;
                        System.out.println("当前前缀：" + flag1);
                    }
                }
            }
        }
        return flag1;
    }
}
