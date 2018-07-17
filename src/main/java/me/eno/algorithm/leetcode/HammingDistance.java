package me.eno.algorithm.leetcode;

public class HammingDistance {
    public static int hammingDistance(int x, int y) {
        int n = 0;
//        for (int i =0; i<32; i++){
//            if (((x & (1 << i)) ^ (y & (1 << i))) !=0){
//                ++n;
//            }
//        }

        int h = x^y;
        while (h>0){
            h = h&(h-1);
            n++;
        }
        return n;
    }

    public static void main(String[] args) {
//        System.out.println(1^8);
        System.out.println(hammingDistance(93,73));
    }
}
