package me.eno.algorithm.leetcode;

public class BackspaceCompare {
    public static boolean backspaceCompare(String S, String T) {
        if (format(S).equals(format(T)))
        return true;
        return false;
    }

    public static String format(String S ){
        for (int i =0; i<S.length(); i++){
            if (S.charAt(i) =='#'){
                if (i>0){
                    S = S.substring(0,i-1)+S.substring(i+1);
                    i--;
                    i--;
                }else{
                    S = S.substring(1);
                    i--;
                }
            }
        }
        return S;
    }


    public static void main(String[] args) {
        System.out.println(backspaceCompare("ab#c","ad#c"));
        System.out.println(backspaceCompare("ab##","cd##"));
        System.out.println(backspaceCompare("a##c","#a#c"));
        System.out.println(backspaceCompare("#a#c","b"));
        System.out.println(backspaceCompare("","b"));
        String s = "abcde#fghi";
//        System.out.println(s.substring(0,5-1)+s.substring(5+1));
    }
}
