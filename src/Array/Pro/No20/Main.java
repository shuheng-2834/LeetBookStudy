package Array.Pro.No20;

import java.util.*;

/**
 * @author 钟书恒
 * @ClassName Main
 * @date 2022/7/14 14:39
 * @Version 1.0
 *
 * 20. 有效的括号
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().isValid("{[]}"));
    }
}

class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 == 1 || s.startsWith(")") || s.startsWith("]") || s.startsWith("}")) {
            return false;
        }
        int len = s.length() / 2;
        for (int i = 0; i < len; i++) {
            s = s.replace("[]", "").replace("{}", "").replace("()", "");
        }
        return s.length() == 0;
    }
}


class SolutionFun1 {
    public boolean isValid(String s) {
        int n = s.length();
        if (n % 2 == 1) {
            return false;
        }

        Map<Character, Character> pairs = new HashMap<Character, Character>() {{
            put(')', '(');
            put(']', '[');
            put('}', '{');
        }};
        Deque<Character> stack = new LinkedList<Character>();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (pairs.containsKey(ch)) {
                if (stack.isEmpty() || !stack.peek().equals(pairs.get(ch))) {
                    return false;
                }
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }
}