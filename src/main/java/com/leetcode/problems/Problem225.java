package com.leetcode.problems;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author: nezha <br>
 * @Title: Problem225 <br>
 * @ProjectName: leetcode-problem <br>
 * @Description: xxxxx <br>
 * @Date: 2020/10/13 9:50 下午 <br>
 */
public class Problem225 {

    class MyStack {
        private Queue<Integer> queue;

        /** Initialize your data structure here. */
        public MyStack() {
            queue = new LinkedList<>();
        }

        /** Push element x onto stack. */
        public void push(int x) {
            queue.offer(x);
            for (int i = 0; i < queue.size() - 1; i++) {
                queue.offer(queue.poll());
            }
        }

        /** Removes the element on top of the stack and returns that element. */
        public int pop() {
            return queue.poll();
        }

        /** Get the top element. */
        public int top() {
            return queue.peek();
        }

        /** Returns whether the stack is empty. */
        public boolean empty() {
            return queue.isEmpty();
        }
    }

}
