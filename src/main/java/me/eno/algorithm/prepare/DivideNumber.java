package me.eno.algorithm.prepare;

import java.util.ArrayList;
import java.util.List;

/**
 * 输入一个整数数组，实现一个函数调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
 * 并保证奇数和奇数，偶数和偶数的相对位置不变。
 */
public class DivideNumber {

    public void devide(int[] intArr){
        List<Integer> oddNum =new ArrayList<Integer>();
        List<Integer> doubleNum =new ArrayList<Integer>();
        for (int i= 0; i<intArr.length; i++){
            if (isOdd(intArr[i])){
                oddNum.add(intArr[i]);
            }else{
                doubleNum.add(intArr[i]);
            }
        }
        oddNum.addAll(doubleNum);
        for (int i = 0; i < oddNum.size(); i++) {
            intArr[i] = oddNum.get(i).intValue();
            System.out.print(oddNum.get(i)+",");
        }
    }

    /**
     * 奇数 true 偶数 false
     */
    private boolean isOdd(int i){
        return (i&1) !=0;
    }
}
