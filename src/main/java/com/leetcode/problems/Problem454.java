package com.leetcode.problems;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: nezha <br>
 * @Title: Problem454 <br>
 * @ProjectName: leetcode-problem <br>
 * @Description: xxxxx <br>
 * @Date: 2020/4/24 11:16 PM <br>
 * <p>
 * https://leetcode-cn.com/problems/4sum-ii/
 */
public class Problem454 {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer, Integer> map = new HashMap<>();
        int res = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                int sumAB = A[i] + B[j];
                if (map.containsKey(sumAB)) {
                    map.put(sumAB, map.get(sumAB) + 1);
                } else {
                    map.put(sumAB, 1);
                }
            }
        }
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < D.length; j++) {
                int sumCD = -(C[i] + D[j]);
                if (map.containsKey(sumCD)) {
                    res = res + map.get(sumCD);
                }
            }
        }


        return res;
    }
}
