package me.eno.algorithm.leetcode;

public class MedianByTwoArr {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length1 = nums1.length;
        int length2 = nums2.length;
        if (length1 == 0){
            return sigleMid(nums2,length2);
        }
        if (length2 == 0){
            return sigleMid(nums1,length1);
        }
        int t1 = (length1+length2+2)/2;
        int t2 = (length1+length2+1)/2;
        return (find(nums1,0,nums2,0,t1)+find(nums1,0,nums2,0,t2))/2.0;


    }

    public static double sigleMid(int[] nums,int length){
        if (length %2  == 1){
            return 1.0*nums[length/2];
        }
        return (nums[length/2]+nums[length/2-1])/2.0;
    }

    public static double find(int[] nums1,int as, int[] nums2,int bs,int k){
        if (as>nums1.length-1){
            return nums2[bs+k-1];
        }
        if (bs>nums2.length-1){
            return nums1[as+k-1];
        }
        if (k == 1){
            return Math.min(nums1[as],nums2[bs]);
        }
        int mid1 = Integer.MAX_VALUE;
        int mid2 = Integer.MAX_VALUE;
        if (as+k/2-1 <nums1.length){
            mid1 =nums1[as+k/2-1];
        }
        if (bs+k/2-1 <nums2.length){
            mid2 = nums2[bs+k/2-1];
        }
        if (mid1>mid2){
            return find(nums1,as,nums2,bs+k/2,k- k/2);
        }else{
            return find(nums1,as+k/2,nums2,bs,k-k/2);

        }
    }

    public static void main(String[] args) {
        int[] a = {1,2};
        int[] b = {3,4};
        MedianByTwoArr m = new MedianByTwoArr();
        System.out.println(m.findMedianSortedArrays(a,b));
    }
}
