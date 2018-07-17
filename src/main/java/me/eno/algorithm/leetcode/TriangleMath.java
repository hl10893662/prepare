package me.eno.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

public class TriangleMath {
    public static int minimumTotal(List<List<Integer>> triangle) {
        int deep = triangle.size();
        if (deep ==1){
            return triangle.get(0).get(0);
        }
        int[] a = new int[deep];
        a[0]  = triangle.get(0).get(0);
        for (int i = 1; i<deep; i++){
            List<Integer> temp = triangle.get(i);
            a[i]=a[i-1]+temp.get(i);
            for (int j = i-1;j>0; j--){
                a[j] = temp.get(j)+Math.min(a[j-1],a[j]);
            }
            a[0]+=temp.get(0);
        }
        int min = a[0];
        System.out.print(a[0]+" ");
        for (int i = 1; i<deep; i++){
            if (a[i]<min){
                min = a[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        List<List<Integer>> a = new ArrayList<List<Integer>>();
        List<Integer> b1 = new ArrayList<Integer>();
        List<Integer> b2 = new ArrayList<Integer>();
        List<Integer> b3 = new ArrayList<Integer>();
        List<Integer> b4 = new ArrayList<Integer>();
//        b1.add(2);
//        b2.add(3); b2.add(4);

        b1.add(-1);
        b2.add(-2); b2.add(-3);
        b3.add(6);b3.add(5);b3.add(7);
        b4.add(4);b4.add(1);b4.add(8);b4.add(3);
        a.add(b1); a.add(b2);
//        a.add(b3);a.add(b4);
        System.out.println(minimumTotal(a));
    }
}
