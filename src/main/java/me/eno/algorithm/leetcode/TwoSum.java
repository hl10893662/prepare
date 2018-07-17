package me.eno.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i<nums.length; i ++){
            if(nums[i]<=target){
                int a = target-nums[i];
                if (map.containsKey(a)){
                    return new int[]{map.get(a),i};
                }else{
                    map.put(nums[i],i);
                }
            }
        }
        throw new IllegalArgumentException("no result");
    }

    public static void main(String[] args) {
     TwoSum ts = new TwoSum();
     int[] nums={2, 7, 11, 15};
     int[] result = ts.twoSum(nums,9);
     for (int i = 0; i<result.length; i++){
         System.out.print(result[i]+",");
     }
    }
}
