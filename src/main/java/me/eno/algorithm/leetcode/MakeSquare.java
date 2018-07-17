package me.eno.algorithm.leetcode;

import java.util.Arrays;

public class MakeSquare {
    public boolean makesquare(int[] nums) {
        int count = 0;
        int length = nums.length;
        int max = 0;
        if (length <4){
            return false;
        }
        for (int i = 0; i<length; i++){
            if (nums[i]>max){
                max = nums[i];
            }
            count+=nums[i];
        }
        if (count  % 4 !=0 || max>count/4){
            return false;
        }

        int side = count /4;
        int[] sums = {0,0,0,0};

        Arrays.sort(nums);
        return build(nums,sums,length-1,side);

    }

    public static boolean build(int[] nums ,int[] sums,int index,int side){
        if (index<0){
            return sums[0] == side
                    && sums[0] == sums[1]
                    && sums[0] == sums[2]
                    && sums[0] == sums[3];

        }

        for (int i = 0; i<4; i++){

            if (sums[i]+nums[index] >side){
                continue;
            }
            sums[i] +=nums[index];
            if(build(nums,sums,index-1,side)){
                return true;
            }
            sums[i]-=nums[index];
        }
        return false;

    }

    public static void main(String[] args) {
        int[] a = {4,4,4,4,7,7,7,7,1,1,1,1,4,4,8};
        MakeSquare ms = new MakeSquare();
        System.out.println(System.currentTimeMillis());

        if (ms.makesquare(a)){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
        System.out.println(System.currentTimeMillis());

    }
}
