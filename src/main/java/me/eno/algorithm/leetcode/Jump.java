package me.eno.algorithm.leetcode;

public class Jump {
    public static  int jump(int[] nums) {

        int current = 0;
        int max = 0;
        int count = 0;
        int length = nums.length;
        if (length == 1){
            return 0;
        }
        if (nums[0] >= length-1){
            return 1;
        }

        for (int i = 0; i<length; i++){
            if (i>current){
                current  = max;
                count++;
            }
            max = Math.max(max,nums[i]+i);
            if (current >=length-1){
                return count;
            }
        }
        return count;
//
//
//        int[] l = new int[nums.length];
//        l[0] = 0;
//        for (int i = 1; i<nums.length; i++){
//            int steps = Integer.MAX_VALUE;
//            for (int j = 0; j<i; j++){
//                if (steps>l[j] && nums[j]+j>=i){
//                    steps = l[j]+1;
//
//                }
//            }
//            l[i] = steps;
//            if(nums[i] +i>=nums.length-1){
//                return steps+1;
//            }
//        }
//        return l[length-1];
    }

    public static void main(String[] args) {
        int[] b = new int[25003];
        for (int i = 25000; i>0; i--){
            b[25000-i] = i;
        }
        b[25000] = 2;
        b[25001] = 2;
        b[25002] = 2;
        System.out.println(b[24999]);

        int[] a ={2,3,1,1,4};
        System.out.println(System.currentTimeMillis());

        System.out.println(jump(a));
        System.out.println(System.currentTimeMillis());

    }
}
