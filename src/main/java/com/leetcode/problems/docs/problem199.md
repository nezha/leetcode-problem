
## 题目

给定一棵二叉树，想象自己站在它的右侧，按照从顶部到底部的顺序，返回从右侧所能看到的节点值。

示例:

```text
输入: [1,2,3,null,5,null,4]
输出: [1, 3, 4]
解释:

   1            <---
 /   \
2     3         <---
 \     \
  5     4       <---
```

## 解题思路

一看就知道BFS，然后每一层的最后一个元素取出来就行了。

讲到BFS那就不得不用到队列，
* 初始肯定只有一个根节点，
* 然后每次遍历长度为queue长度的元素
* 期间发现的左右节点也要放进去
* 一次遍历结束后就可以计算下一层的元素个数了