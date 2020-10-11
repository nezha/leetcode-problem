package com.leetcode.problems;

/**
 * @author: nezha <br>
 * @Title: Problem203 <br>
 * @ProjectName: leetcode-problem <br>
 * @Description: 移除链表元素 <br>
 * @Date: 2020/10/11 11:21 下午 <br>
 */
public class Problem203 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
    public ListNode removeElements(ListNode head, int val) {
        if (head == null){
            return head;
        }
        ListNode sentinel = new ListNode(0);
        sentinel.next = head;
        ListNode pre = sentinel;
        ListNode curr = head;
        while (curr != null){
            if (curr.val == val){
                pre.next = curr.next;
                curr = curr.next;
            }else {
                pre = pre.next;
                curr = curr.next;
            }

        }
        return sentinel.next;
    }
}
