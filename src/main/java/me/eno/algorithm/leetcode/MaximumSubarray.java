package me.eno.algorithm.leetcode;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        if (nums.length ==0){
            return nums[0];
        }
        int maxsofar,maxendinghere;
        maxsofar = nums[0];
        maxendinghere = 0;
        for(int i=0; i<nums.length; i++){
            if (maxendinghere>0){
                maxendinghere+=nums[i];
            }else{
                maxendinghere =nums[i];
            }
            if (maxsofar<maxendinghere){
                maxsofar = maxendinghere;
            }
        }
        return maxsofar;
    }


    public static int max(int a,int b,int c){
        int max =a;
        if (max<b){
            max = b;
        }
        if (max<c){
            return c;
        }
        return max;
    }

    public static void main(String[] args) {
        MaximumSubarray ms = new MaximumSubarray();
//        int[] a = {-2,1,-3,4,-1,2,1,-5,4};
//         System.out.println(ms.maxSubArray(a));
//         int[] b={-2,-1};
//         System.out.println(ms.maxSubArray(b));
//            int[] c={1,2};
//         System.out.println(ms.maxSubArray(c));
//        int[]  d={2,1};
//        System.out.println(ms.maxSubArray(d));
        int[] e = {8,-19,-1,5,-4,20};
        System.out.println(ms.maxSubArray(e));

    }
}
