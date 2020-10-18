package com.leetcode.problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author: nezha <br>
 * @Title: Problem20 <br>
 * @ProjectName: leetcode-problem <br>
 * @Description: xxxxx <br>
 * @Date: 2020/10/18 6:41 下午 <br>
 */
public class Problem20 {
    public boolean isValid(String s) {
        Map<Character,Character> map = new HashMap<>();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (stack.isEmpty()){
                stack.push(s.charAt(i));
            }else {
                if (!map.containsKey(stack.peek())){
                    return false;
                } else if (map.get(stack.peek()).equals(s.charAt(i))){
                    stack.pop();
                }else {
                    stack.push(s.charAt(i));
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Problem20 problem20 = new Problem20();
        problem20.isValid("([)]");
    }
}
