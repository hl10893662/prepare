package me.eno.algorithm.leetcode;

public class NumSubarrayProductLessThanK {
    public static int numSubarrayProductLessThanK(int[] nums, int k) {

        if (k<=1) return 0;
        int result = 0;
        int start = 0;
        int end = 0;
        int sum = 1;
        int length = nums.length;
        for ( end =0;end<nums.length; end++ ){
            sum*=nums[end];
            while (sum>=k) {
                sum/=nums[start++];
            }
            result +=(end-start+1);
        }
        return result;

//
//
//        int before = 0;
//        for (int i =0; i<length; i++){
//            if (i >0){
//                if (nums[i-1] == nums[i]  &&  nums[i] == 1 && before >0)   {
//                    before = before-1;
//                }else{
//                    before=count(nums,i,k,length);
//                }
//            }else{
//                before=count(nums,i,k,length);
//            }
//
//            System.out.println(nums[i]+","+before);
//            result +=before;
//        }
//        return result;
    }
    public static int count(int[] nums,int index,int k,int length){
        int end = index;
        long mu = nums[index];
        while (mu<k && end<length){
            end++;
            if (end<length){
                mu *=nums[end];
            }
        }
        return Math.max(end-index,0);
    }

    public static void main(String[] args) {
        int[] a={10,5,2,6};
        System.out.println(System.currentTimeMillis());
        System.out.println(numSubarrayProductLessThanK(a,100));
        System.out.println(System.currentTimeMillis());
    }
}
