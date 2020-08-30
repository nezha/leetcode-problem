package com.leetcode.problems.nowCode;

import java.util.*;
import java.util.stream.IntStream;

/**
 * @author: nezha <br>
 * @Title: LRU <br>
 * @ProjectName: leetcode-problem <br>
 * @Description: xxxxx <br>
 * @Date: 2020/8/30 10:44 下午 <br>
 */
public class LRU {
    public static void main(String[] args) {
        int[][] input = {{1,1,1},{1,2,2},{1,3,2},{2,1},{1,4,4},{2,2}};
        LRU lru = new LRU();
        int[] res = lru.LRU(input,3);
        System.out.printf("---");
    }
    /**
     * lru design
     * @param operators int整型二维数组 the ops
     * @param k int整型 the k
     * @return int整型一维数组
     */
    Map<Integer,Integer> map=new HashMap<>();
    List<Integer> keyList =new LinkedList<Integer>();
    public int[] LRU (int[][] operators, int k) {
        // write code here
        List<Integer> res = new ArrayList();
        for(int i = 0;i<operators.length;i++){
            int[] item = operators[i];
            if(item[0] == 1){
                setItem(item,k);
            }else{
                getItem(res, item[1]);
            }
        }
        int[] array = new int[res.size()];
        IntStream.range(0,res.size()).forEach(i->{
            array[i] = res.get(i);
        });
        map.clear();
        keyList.clear();
        return array;
    }

    private void getItem(List<Integer> res, int key) {
        Integer x = map.getOrDefault(key,-1);
        res.add(x);
        if (x == -1){
            return;
        }
        //调整keyList顺序
        int pos = keyList.indexOf(key);
        keyList.remove(pos);
        keyList.add(key);
    }

    private void setItem(int[] item,int k) {
        //set 语句
        if (keyList.size()<k){
            boolean inMap = map.containsKey(item[1]);
            if (inMap){
                //调整keyList顺序
                int pos = keyList.indexOf(item[1]);
                keyList.remove(pos);
                keyList.add(item[1]);
            }else {
                map.put(item[1], item[2]);
                keyList.add(item[1]);
            }
        }else {
            boolean inMap = map.containsKey(item[1]);
            if (inMap){
                //调整keyList顺序
                int pos = keyList.indexOf(item[1]);
                keyList.remove(pos);
                keyList.add(item[1]);
            }else {
                //删除map中的过期值
                //删除keyList中过期值
                //更新map和keyList
                map.remove(keyList.get(0));
                keyList.remove(0);
                map.put(item[1], item[2]);
                keyList.add(item[1]);
            }
        }
    }
}
