package Array.Pro.No1252;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author 钟书恒
 * @ClassName Main
 * @date 2022/7/12 15:41
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        int[][] indices = new int[][]{{17, 16}, {26, 31}, {19, 12}, {22, 24}, {17, 28}, {23, 21}, {27, 32}, {23, 27}, {23, 33}, {18, 7}, {4, 20}, {0, 31}, {25, 33}, {5, 22}};
        new Solution().oddCells(28, 38, indices);
    }
}

class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int count = 0;
        int[][] sq = new int[m][n];
        for (int[] ints : sq) {
            Arrays.fill(ints, 0);
        }
        for (int[] index : indices) {
            int row = index[0];
            int col = index[1];

            // 矩阵的行加一
            for (int i1 = 0; i1 < sq[row].length; i1++) {
                sq[row][i1] += 1;
            }

            // 矩阵的列加一
            for (int i1 = 0; i1 < sq.length; i1++) {
                sq[i1][col] += 1;
            }
        }

        int all = 0;
        for (int[] ints : sq) {
            for (int anInt : ints) {
                if (anInt % 2 == 1 || anInt == 1) {
                    count += 1;
                } else if (anInt % 2 == 0) {
                    all += 1;
                }
            }
        }
        return count;
    }

    public int oddCellsFun2(int m, int n, int[][] indices) {
        int count = 0;
        int[] row = new int[m];
        int[] col = new int[n];

        for (int[] index : indices) {
            row[index[0]]++;
            col[index[1]]++;
        }

        for (int i : row) {
            for (int i1 : col) {
                if (((i + i1) % 2) == 1){
                    count++;
                }
            }
        }
        return count;
    }
}
