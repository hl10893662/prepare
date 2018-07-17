package me.eno.algorithm.leetcode;

public class IsPowerOfThree {
    public static boolean isPowerOfThree(int n) {
        if (n>0 && 1162261467 % 3 == 0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfThree(3));
    }
}
