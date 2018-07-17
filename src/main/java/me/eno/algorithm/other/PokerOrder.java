package me.eno.algorithm.other;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PokerOrder {
    private static void findOrder(int n){
        List<Integer> list = new ArrayList<Integer>();
        Queue<Integer> queue = new LinkedList<Integer>();
        int[] arr = new int[n];
        for(int i = 1; i<=n; i++){
            queue.add(i);
        }
        int index = 0;
        while (index <n){
            arr[n-1-index] = queue.poll();
            if (index<n)
            ((LinkedList<Integer>) queue).add(queue.poll());
            index++;
        }
        int[] orderArr = new int[n+1];
        for (int i = 0; i<n; i++){
            orderArr[arr[i]] = i+1;
        }
        for (int i = 1; i<n+1; i++){
            System.out.println(orderArr[i]);
        }

    }

    public static void main(String[] args) {
        findOrder(7);
    }
}
