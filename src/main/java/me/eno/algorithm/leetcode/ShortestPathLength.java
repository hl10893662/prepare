package me.eno.algorithm.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathLength {
    public static int shortestPathLength(int[][] graph) {
        if (graph.length ==1 ){
            return 0;
        }
        int[][] A = new int[graph.length][graph.length];
        for (int i = 0; i<graph.length; i++){
            for(int j = 0; j<graph[i].length; j++){
                A[i][graph[i][j]] = 1;
            }
        }
        int n=A.length;                                                         //元素个数
        ArrayList<Integer> result=new ArrayList<Integer>();
        Queue<Integer> thequeue = new LinkedList<Integer>();                    //LinkedLis实现queue接口
        boolean[] marked=new boolean[n];                                        //marked[i]标记是否被遍历过,遍历过为true
        for (int i = 0; i < n; i++) {
            marked[i] = false;                                                      //初始化标记数组
        }
        int startNode=0;                                                        //搜索起始结点
        thequeue.offer(startNode);                                              //起始结点装入队列
        result.add(startNode);                                                  //起始结点装入遍历数组
        marked[startNode]=true;                                                 //更新起始结点的访问标志

        while(!thequeue.isEmpty()){                                             //队列非空
            int v1=(int)thequeue.poll();
            for (int k= 0; k<n; k++) {
                if (A[v1][k]>0&&marked[k]==false&&v1!=k) {
                    thequeue.offer(k);                                                     //压入队列
                    marked[k] = true;                                                      //更新访问标志位
                    result.add(k);                                                         //更新遍历数组
                }
            }
        }
//        System.out.println(result);
        return result.size();

    }

    public static void main(String[] args) {
//        int[][] a = {{1,2,3},{0},{0},{0},};
        int[][] a = {{1},{0,2,4},{1,3,4},{2},{1,2}};
//        int[][]a = {{}};
//        int[][] a={{1},{0}};
        System.out.println(shortestPathLength(a));
    }
}
