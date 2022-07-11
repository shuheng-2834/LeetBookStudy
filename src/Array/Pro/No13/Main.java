package Array.Pro.No13;

import java.util.HashMap;
import java.util.List;

/**
 * @author 钟书恒
 * @ClassName Main
 * @date 2022/7/11 14:34
 * @Version 1.0
 *
 *
 */
public class Main {
    public static void main(String[] args) {
        new Solution().romanToInt("MCMXCIV");
    }
}

class Solution {
    public int romanToInt(String s) {
        List<String> stringList = List.of(s.split(""));
        HashMap<String, Integer> hsh = new HashMap<String, Integer>();
        hsh.put("I", 1);
        hsh.put("V", 5);
        hsh.put("X", 10);
        hsh.put("L", 50);
        hsh.put("C", 100);
        hsh.put("D", 500);
        hsh.put("M", 1000);
        int count = 0;

        for (int i = 0; i < stringList.size(); i++) {
            // 如果为最后一位，则无需判断是否为六种情况之一，直接相加
            if (i + 1 >= stringList.size()) {
                count += hsh.get(stringList.get(i));
            } else {
                String flag = s.substring(i, i + 1);
                // 判断是否为‘I’,'X'或‘C’情况
                if ("I".equals(flag)) {
                    switch (stringList.get(i + 1)) {
                        case "V":
                            count += 4;
                            i += 1;
                            continue;
                        case "X":
                            count += 9;
                            i += 1;
                            continue;
                        default:
                            count += 1;
                            continue;
                    }
                }
                if ("X".equals(flag)) {
                    switch (stringList.get(i + 1)) {
                        case "L":
                            count += 40;
                            i += 1;
                            continue;
                        case "C":
                            count += 90;
                            i += 1;
                            continue;
                        default:
                            count += 10;
                            continue;
                    }
                }
                if ("C".equals(flag)) {
                    switch (stringList.get(i + 1)) {
                        case "D":
                            count += 400;
                            i += 1;
                            continue;
                        case "M":
                            count += 900;
                            i += 1;
                            continue;
                        default:
                            count += 100;
                            continue;
                    }
                }
                // 如果都不是，则直接将其转换为阿拉伯数字
                count += hsh.get(flag);
            }
        }
        return count;
    }
}
