package me.eno.algorithm.leetcode;

import java.util.Stack;

public class Find132pattern {
    public static boolean find132pattern(int[] nums) {
        if ( nums == null ||nums.length<3)
            return false;
        int n = nums.length;
        Stack<Integer> stack = new Stack<Integer>();
        int standard = Integer.MIN_VALUE;
        for (int i = n-1 ; i>=0; i--){
            if (nums[i]< standard) return true;
            while(!stack.isEmpty() && nums[i]> stack.peek()){
                standard = stack.pop();
            }
            stack.push(nums[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a={1,3,2};
        System.out.println(find132pattern(a));
    }
}