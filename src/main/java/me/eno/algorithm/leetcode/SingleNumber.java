package me.eno.algorithm.leetcode;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        int n = 0;
        for (int j = 4; j>=0; j--){
            n = n<<1;
            int k = 0;
            for (int i = 0; i<nums.length; i++){
                k+=nums[i] >> j & 1;
            }
            if (k  % 3 != 0){
                n++;
            }
        }
        return n;
    }

    public static int singleNumber1(int[] A) {
        int ones = 0, twos = 0;
        for(int i = 0; i < A.length; i++){
            ones = (ones ^ A[i]) & ~twos;
            twos = (twos ^ A[i]) & ~ones;
            System.out.println(i+","+A[i]+","+ones+","+twos);
        }
        return ones;
    }

    public static void main(String[] args) {
        int[] a  ={2,3,2,3,2,3,1};
        System.out.println(singleNumber1(a));
//        System.out.println(2^2);
//        System.out.println(sloveCalled("0106460587"));
//        System.out.println(sloveCalled("01350000000"));
    }
    private static String sloveCalled(String called){
        //.replaceFirst("^0*", "");
        String temp = called.replaceFirst("^0*", "");
        if (called.length()>=10 &&
                (temp.indexOf("1") == 0  || temp.indexOf("2") ==0)  && "0".equals(temp.subSequence(1, 2))){
            return "0"+temp;
        }else{
            if (temp.indexOf("1") == 0 && !"0".equals(temp.subSequence(1, 2))){
                return temp;
            }else{
            }
        }
        return "";
    }
}
