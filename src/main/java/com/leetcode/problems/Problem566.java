package com.leetcode.problems;

/**
 * @author: nezha <br>
 * @Title: Problem566 <br>
 * @ProjectName: leetcode-problem <br>
 * @Description: xxxxx <br>
 * @Date: 2020/5/17 10:14 PM <br>
 * url: https://leetcode-cn.com/problems/reshape-the-matrix/
 * 在MATLAB中，有一个非常有用的函数 reshape，它可以将一个矩阵重塑为另一个大小不同的新矩阵，但保留其原始数据。
 * <p>
 * 给出一个由二维数组表示的矩阵，以及两个正整数r和c，分别表示想要的重构的矩阵的行数和列数。
 * <p>
 * 重构后的矩阵需要将原始矩阵的所有元素以相同的行遍历顺序填充。
 * <p>
 * 如果具有给定参数的reshape操作是可行且合理的，则输出新的重塑矩阵；否则，输出原始矩阵。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reshape-the-matrix
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Problem566 {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        //第一步，判断是否合法，否则输出
        int m = nums.length;
        if (m == 0) {
            return nums;
        }
        int n = nums[0].length;
        if (m * n != r * c) {
            return nums;
        }
        int[][] res = new int[r][c];
        int k = 0, l = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res[k][l] = nums[i][j];
                if (k != r - 1 && l == c - 1) {
                    k++;
                    l=0;
                }else {
                    l++;
                }
            }

        }
        return res;
    }
}
