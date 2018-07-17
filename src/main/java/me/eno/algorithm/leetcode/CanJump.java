package me.eno.algorithm.leetcode;

public class CanJump {
    public static boolean canJump(int[] nums) {
        int length = nums.length;
        if (length <= 1){
            return true;
        }
        int max = nums[0];
        for (int i = 1; i<length; i++){
            if (max<i){
                return false;
            }
            max = Math.max(max,nums[i]+i);
        }
        return false;
    }
    public static boolean canJump1(int[] nums) {
        int length = nums.length-1;
        int i;
        for (i = length-1; i>=0; i--){
            if(nums[i]>=length-i){
                length = i;
            }
        }
        return length ==0;
    }


    public static void main(String[] args) {
        int[] a = {2,3,1,1,4};
//        int[] a = {3,2,1,0,4};
//        int[] a = {3,2,1,0,4};
        System.out.println(canJump1(a));
    }
}
