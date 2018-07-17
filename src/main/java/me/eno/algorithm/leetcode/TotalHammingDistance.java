package me.eno.algorithm.leetcode;

public class TotalHammingDistance {
    public static int totalHammingDistance(int[] nums) {
        int n = 0;
        for (int j = 0; j<32; j++){
            int k = 0;
            for (int i =0; i<nums.length; i++) {
                k+=nums[i] >>j &1;
            }
            n+=k*(nums.length-k);
        }
        return n;
    }


    public static int hammingDistance(int x, int y) {
        int n = 0;
        int h = x^y;
        while (h>0){
            h = h&(h-1);
            n++;
        }
        return n;
    }

    public static void main(String[] args) {
        int[] a = {4,14,2};
        System.out.println(totalHammingDistance(a));
//        System.out.println(8 &(1<<3));
    }
}
