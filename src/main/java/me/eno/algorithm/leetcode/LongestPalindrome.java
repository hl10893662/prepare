package me.eno.algorithm.leetcode;

public class LongestPalindrome {
    public static String longestPalindrome(String s) {
        int length = s.length();
        if (length == 1){
            return s;
        }
        int maxlength = 1;
        int start=0;
        boolean[][] a = new boolean[length][length];
        for (int i =0; i<length-1; i++){
            a[i][i] = true;
            if (i<length && s.charAt(i) == s.charAt(i+1)){
                start=i;
                a[i][i+1] = true;
                maxlength = 2;
            }else{
                a[i][i+1] = false;
            }
        }
        for (int len = 3; len<=length; len++){
            for (int i = 0; i<=length-len; i++){
                int j = len+i-1;
                if (a[i+1][j-1] &&  s.charAt(i) == s.charAt(j)){
                    a[i][j] = true;
                    maxlength = len;
                    start = i;
                }
            }
        }
        return s.substring(start,start+maxlength);

    }

    public static void main(String[] args) {
        String s = "ccc";
        System.out.println(longestPalindrome(s));
    }

}
