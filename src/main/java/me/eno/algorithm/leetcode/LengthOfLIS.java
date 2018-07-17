package me.eno.algorithm.leetcode;

public class LengthOfLIS {
    public static int lengthOfLIS(int[] nums) {
        if (nums.length<2){
            return nums.length;
        }
        int n = nums.length;
        int[] a= new int[n];
        int[] flag = new int[n];
        a[0] = 1;
        flag[0] = nums[0];
        for (int i =1; i<n; i++){
            a[i] = 1;
            flag[i] = nums[i];
            for (int j = 0; j<i ; j++){
                if(nums[i]>flag[j]){
                    if (a[i] <= a[j]){
                        a[i]=a[j]+1;
                        flag[i] =nums[i];
                    }
                }else{
                    if (a[i] < a[j]){
                        a[i] = a[j];
                        flag[i] = flag[j];
                    }
                }
            }
        }
        return a[n-1];
    }

    public static void main(String[] args) {
//        int[] a= {2,2,2,2};
//        int[] a= {1,3,5,4,7};
//        int[] a= {4,10,4,3,8,9};
        int[] a= {3,5,6,2,5,4,19,5,6,7,12};
//        int[] a= {10,9,2,5,3,7,101,18};
        System.out.println(lengthOfLIS(a));
    }
}
