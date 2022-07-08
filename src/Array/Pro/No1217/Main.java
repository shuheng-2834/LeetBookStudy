package Array.Pro.No1217;

/**
 * @author 钟书恒
 * @ClassName main
 * @date 2022/7/7 15:07
 * @Version 1.0
 *
 * 统计奇数和偶数的个数，然后比较奇数和偶数的个数，返回个数较少的
 */
public class Main {

    public static void main(String[] args) {
        int i = new SolutionFun1().minCostToMoveChips(new int[]{1,2,3});
        System.out.println(i);
    }
}

class SolutionFun1 {
    public int minCostToMoveChips(int[] position) {
        int odd = 0,ji = 0;
        for (int j : position) {
            if (j % 2 == 0) {
                odd++;
            } else if (j % 2 == 1) {
                ji++;
            }
        }
        return Math.min(odd, ji);
    }
}