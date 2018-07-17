package me.eno.algorithm.leetcode;

public class FindPoisonedDuration {
    public static int findPoisonedDuration(int[] timeSeries, int duration) {
        if (timeSeries.length == 0){
            return 0;
        }
        int length = timeSeries.length;
        int curr =timeSeries[0]-1+duration;
        int total = duration;
        for (int i = 1; i<length; i++){
            if (curr<=timeSeries[i]-1){
                total+=duration;
                curr=timeSeries[i]-1+duration;
            }else{
                int a = Math.max(0,duration-(curr-(timeSeries[i]-1)));
                total+=a;
                curr+=a;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        int[] a = {1,2};
        System.out.println(findPoisonedDuration(a,2));
        int[] b = {1,3};
        System.out.println(findPoisonedDuration(b,2));
        int[] c = {1,4};
        System.out.println(findPoisonedDuration(c,2));
        int[] d = {0,1,2,3,4,5};
        System.out.println(findPoisonedDuration(d,1));

    }
}
