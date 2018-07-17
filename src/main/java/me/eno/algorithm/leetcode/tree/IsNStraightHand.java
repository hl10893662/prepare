package me.eno.algorithm.leetcode.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IsNStraightHand {
    public static boolean isNStraightHand(int[] hand, int W) {
        if (hand.length % W != 0){
            return false;
        }
        Arrays.sort(hand);
        List<Integer> list = new ArrayList<Integer>();
        for(int i= 0;i<hand.length;i++){
            list.add(hand[i]);
        }
        for (int i = 0; i<hand.length / W ; i++){
            int curr = (Integer)list.get(0);
            list.remove(0);
            for (int j = 0; j<W-1; j++){
                int index =0;
                while (index<list.size()  && list.get(index) - curr <= 0 ){
                        index++;
                }
                if (index == list.size()){
                    return false;
                }
                if (list.get(index)-curr !=1){
                    return false;
                }else{
                    curr++;
                    list.remove(index);
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
//        int[] a = {1,2,3,6,2,3,4,7,8};
//        int[] a = {4,1,0,4};
//        int[] a = {1,2,3,4,5,6};
//        int[] a = {5,1};
        int[] a = {1,1,2,2,3,3};
        System.out.println(isNStraightHand(a,3));
    }
}
