package me.eno.algorithm.leetcode;

public class LongestMountain {
    public static int longestMountain(int[] A) {
        if (A.length<3){
            return 0;
        }

        int len = 0;
        for (int i = 1; i<A.length-1; i++){
            int back = 1;
            for (int j = i; j<A.length-1; j++){
                if (A[j+1]<A[j]){
                    back++;
                }else{
                    break;
                }
            }
            int front = 1;
            for (int j =i; j>0; j--){
                if (A[j]>A[j-1]){
                    front++;
                }else{
                    break;
                }
            }
            if (back>1 && front>1){
                len = Math.max(len,back+front-1);
            }
        }

        return len>=3?len:0;
    }

    public static void main(String[] args) {
//        int[] a = {2,1,4,7,3,2,5};
//        int[] a = {0,1,2,3,4,5,6,7,8,9};
//        int[] a = {2,2,2};
//        int[] a = {0,1,2,3,4,5,4,3,2,1,0};
        int[] a={0,1,0};
        System.out.println(longestMountain(a));
    }
}
