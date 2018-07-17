package me.eno.algorithm.leetcode;

public class IsPowerOfFour {
    public static boolean isPowerOfFour(int num) {
        if (num<0){
            return false;
        }
        return (num & num-1) == 0 && (num & 0x55555555) ==num;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfFour(40));
        System.out.println(isPowerOfFour(4));
        System.out.println(isPowerOfFour(2));
        System.out.println(isPowerOfFour(1));

    }
}
