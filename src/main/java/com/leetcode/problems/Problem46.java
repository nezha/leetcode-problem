package com.leetcode.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: nezha <br>
 * @Title: Problem46 <br>
 * @ProjectName: leetcode-problem <br>
 * @Description: xxxxx <br>
 * @Date: 2020/4/25 8:34 PM <br>
 * https://leetcode-cn.com/problems/permutations/
 * [回溯法](./docs/回溯算法思路.md)
 */
public class Problem46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new LinkedList();

        ArrayList<Integer> output = new ArrayList<Integer>();
        for (int num : nums){
            output.add(num);
        }
        int n = nums.length;
        backtrack(n, output, res, 0);
        return res;

    }

    private void backtrack(int n, ArrayList<Integer> output, List<List<Integer>> res, int level) {
        if (n == level){
            res.add(new ArrayList<>(output));
        }
        for (int i = level; i < n; i++) {
            Collections.swap(output,level,i);
            backtrack(n,output,res,level+1);
            Collections.swap(output,level,i);
        }
    }
}
