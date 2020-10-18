package com.leetcode.problems;

/**
 * @author: nezha <br>
 * @Title: Problem19 <br>
 * @ProjectName: leetcode-problem <br>
 * @Description: xxxxx <br>
 * @Date: 2020/10/18 8:55 下午 <br>
 */
public class Problem19 {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p = head;
        //初始一个临时头结点
        ListNode q = new ListNode(0);
        ListNode init = q;
        q.next = head;
        for (int i = 0; i < n; i++) {
            p = p.next;
        }
        while (p != null){
            q = q.next;
            p = p.next;
        }
        q.next = q.next.next;
        return init.next;
    }
}
