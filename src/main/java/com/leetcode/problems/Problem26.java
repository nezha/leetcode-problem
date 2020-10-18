package com.leetcode.problems;

/**
 * @author: nezha <br>
 * @Title: Problem26 <br>
 * @ProjectName: leetcode-problem <br>
 * @Description: xxxxx <br>
 * @Date: 2020/10/18 7:30 下午 <br>
 */
public class Problem26 {
    public int removeDuplicates(int[] nums) {
        int result = 0;
        if (nums.length == 1){
            return 1;
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]){
                result++;
                nums[result] = nums[i];
            }
        }
        return result + 1;

    }
}
