package com.leetcode.problems;

import java.util.PriorityQueue;

/**
 * @author: nezha <br>
 * @Title: Problem23 <br>
 * @ProjectName: leetcode-problem <br>
 * @Description: xxxxx <br>
 * @Date: 2020/4/27 8:52 PM <br>
 * https://leetcode-cn.com/problems/merge-k-sorted-lists/
 * 合并 k 个排序链表，返回合并后的排序链表。请分析和描述算法的复杂度。
 */
public class Problem23 {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        PriorityQueue<ListNode> priorityQueue = new PriorityQueue<>(lists.length, (o1, o2) -> (o1.val - o2.val));
        ListNode dummy = new ListNode(0);
        ListNode p = dummy;
        for (ListNode node : lists) {
            if (node != null) {
                priorityQueue.add(node);
            }
        }
        while (!priorityQueue.isEmpty()) {
            p.next = priorityQueue.poll();
            p = p.next;
            if (p.next != null) {
                priorityQueue.add(p.next);
            }
        }
        return dummy.next;
    }
}
