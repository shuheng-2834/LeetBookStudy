package BilibiliVideoStudy.CodeP2;

/**
 * @author 钟书恒
 * @ClassName Main
 * @date 2022/7/17 11:23
 * @Version 1.0
 *
 * 使用位运算求数字的二进制
 */
public class BitOpp {
    public static void main(String[] args) {
        print(31);
    }

    public static void print(int num) {
        for (int i = 31; i >= 0; i--) {
            System.out.print((num & (1 << i)) == 0 ? '0' : '1');
        }
    }
}
