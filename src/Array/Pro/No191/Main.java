package Array.Pro.No191;

/**
 * @author 钟书恒
 * @ClassName Main
 * @date 2022/7/27 22:53
 * @Version 1.0
 *
 * 191. 位1的个数
 */
public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public int hammingWeight(int n) {
        int ret = 0;
        for (int i = 0; i < 32; i++) {
            if ((n & (1 << i)) != 0) {
                ret++;
            }
        }
        return ret;
    }
}
