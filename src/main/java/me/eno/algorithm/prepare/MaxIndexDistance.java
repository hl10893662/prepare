package me.eno.algorithm.prepare;

/**
 * 给定一个整数数组，找出两个下标，要求后面下标所指的数减去前面下标所指的数之差最大
 */
public class MaxIndexDistance {

    public static void slove(int[] dataArr){
        int cMinIndex = 0;
        int cMaxIndex = 0;
        int minIndex = 0;
        int length = 0;
        if (dataArr.length<2){
            System.out.println("to short");
        }
        for (int i = 1; i<dataArr.length; i++){

            //less than min
            if (dataArr[i] <dataArr[minIndex]){
                minIndex =i;
                //bigger than max
            }else if (dataArr[i] >dataArr[cMaxIndex]){
                cMaxIndex = i;
                length = dataArr[i]-dataArr[minIndex];
                cMinIndex = minIndex;
            }else{

                if (dataArr[i] - dataArr[minIndex] >length){
                    cMinIndex = minIndex;
                    cMaxIndex = i;
                    length = dataArr[i] - dataArr[minIndex];
                }
            }
        }
        System.out.println("("+cMinIndex+","+cMaxIndex+")");
    }

    public static void main(String[] args) {
        int[] a={3,1,5,8,6,2,0,9};
        slove(a);
    }
}
