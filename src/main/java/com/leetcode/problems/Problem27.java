package com.leetcode.problems;

/**
 * @author: nezha <br>
 * @Title: Problem27 <br>
 * @ProjectName: leetcode-problem <br>
 * @Description: xxxxx <br>
 * @Date: 2020/10/18 8:30 下午 <br>
 */
public class Problem27 {
    public int removeElement(int[] nums, int val) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val){
                nums[res] = nums[i];
                res++;
            }
        }
        return res;

    }
}
