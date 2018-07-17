package me.eno.algorithm.leetcode;

public class StringMatch {
    public static boolean isMatch(String s, String p) {
        int slen = s.length();
        int plen = p.length();
        if(slen ==0 && plen == 0){
            return true;
        }
        if (plen ==0){
            return false;
        }

        boolean[][] ifMatch = new boolean[slen+1][plen+1];
        ifMatch[0][0] = true;
        for (int i = 1; i<=plen; i++){
            if (p.charAt(i-1)=='*' && ifMatch[0][i-1]){
                ifMatch[0][i] =true;
            }
        }

        for (int i =1; i<=slen; i++){
            for (int j =1 ; j<=plen; j++){
                if (p.charAt(j-1) == '*'){
                    ifMatch[i][j] =(ifMatch[i-1][j] || ifMatch[i][j-1]);
                }else{
                    ifMatch[i][j] =(ifMatch[i-1][j-1] &&(
                    s.charAt(i-1) == p.charAt(j-1) || p.charAt(j-1) == '?'));
                }
            }
        }
        return ifMatch[slen][plen];
    }

    public static boolean isMatch1(String s,String p){
        int slen = s.length();
        int plen = p.length();
        if(slen ==0 && plen == 0){
            return true;
        }
        if (plen ==0){
            return false;
        }
        int sindex = 0;
        int pindex = 0;
        int starindex = -1;
        int mindex = -1;
        while (sindex<slen){
            if (pindex < plen && p.charAt(pindex) == '*'){
                 starindex = pindex;
                 pindex++;
                 mindex = sindex;
             }else if (pindex < plen && (p.charAt(pindex) == '?' || p.charAt(pindex) == s.charAt(sindex))){
                sindex++;
                pindex++;
             }else if (starindex >-1 ){
                 pindex = starindex+1;
                 mindex ++;
                 sindex = mindex;
             }else{
                 return false;
             }
        }

        while(pindex < plen && p.charAt(pindex) == '*' ) {
                pindex++;
        }
        return pindex == plen;
    }

    public static void main(String[] args) {
        String s = "aa";
        String p = "a";
        make(s,p);
        s = "aa";
        p = "*";
        make(s,p);
        s = "cb";
        p = "*a";
        make(s,p);
        s = "adceb";
        p = "*a*b";
        make(s,p);
        s = "acdcb";
        p = "a*c?b";
        make(s,p);
    }
    public static void make(String s,String p){
        if (isMatch1(s,p)){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
