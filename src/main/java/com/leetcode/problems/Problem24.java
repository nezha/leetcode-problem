package com.leetcode.problems;

/**
 * @author: nezha <br>
 * @Title: Problem24 <br>
 * @ProjectName: leetcode-problem <br>
 * @Description: xxxxx <br>
 * @Date: 2020/10/13 10:17 下午 <br>
 */
public class Problem24 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode next = head.next;
        head.next = swapPairs(next.next);
        next.next = head;
        return next;
    }
}
