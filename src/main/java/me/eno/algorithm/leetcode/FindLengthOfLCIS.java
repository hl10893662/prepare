package me.eno.algorithm.leetcode;

public class FindLengthOfLCIS {
    public static  int findLengthOfLCIS(int[] nums) {
        if (nums.length<2){
            return nums.length;
        }
        int length = nums.length;
        int curr = 1;
        int lcis = 1;
        for (int i = 1; i<length; i++){
            if (nums[i]>nums[i-1]){
                    curr++;
            }else{
                curr = 1;
            }
            if (curr>lcis ){
                lcis = curr;
            }
        }
        return lcis;
    }

    public static void main(String[] args) {
//        int[] a = {1,3,5,4,7};
        int[] a = {1,2,5,8,0};
        System.out.println(findLengthOfLCIS(a));
    }
}
