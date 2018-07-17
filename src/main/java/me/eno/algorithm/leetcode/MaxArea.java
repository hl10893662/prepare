package me.eno.algorithm.leetcode;

import java.util.Stack;

/**
 * 如何当前遍历的元素的元素为i，当前栈顶元素元素为j,弹出栈顶元素后，新的栈顶元素为k。
 * 那么现在考虑以元素为j为根基，其向左最左能达到k+1,因为j最左最近小于j的元素应该为k,那么向右最远应该能到i-1,因为j之所以被弹出，
 * 就是因为遇到了第一个比位置j值小的位置。所以其最大子矩阵大小结算为(i-k-1)*height[j].
 */
public class MaxArea {
    public static int maximalRectangle(char[][] matrix) {
        if (matrix.length ==0 ){
            return 0;
        }

        int row = matrix.length;
        int col = matrix[0].length;
        int maxArea = 0;
        int[] a = new int[col+1];
        for (int j =0; j<row;j++){
            Stack<Integer> stack = new Stack<Integer>();
            for(int i = 0; i<a.length; ++i){
                if (i<col){
                    a[i] = (matrix[j][i]-'0' == 0)?0:a[i]+1;
                }
                if (stack.isEmpty() || a[i] >=a[stack.lastElement()]){
                    stack.push(i);
                }else{
                    while(!stack.isEmpty()  && a[i]<=a[stack.lastElement()]){
                        int top = stack.lastElement();
                        stack.pop();
                        int curArea = a[top] *(stack.isEmpty()?i:i-stack.lastElement()-1);
                        maxArea = Math.max(maxArea,curArea);
                    }
                }
                stack.push(i);
            }
        }
        return maxArea;

    }

    public static int maxArea(int[] a){
        Stack<Integer> stack = new Stack<Integer>();
        int maxArea = 0;
        for(int i = 0; i<a.length; ++i){
            if (stack.isEmpty() || a[i] >=a[stack.lastElement()]){
                stack.push(i);
            }else{
                while(!stack.isEmpty()  && a[i]<=a[stack.lastElement()]){
                    int top = stack.lastElement();
                    stack.pop();
                    int curArea = a[top] *(stack.isEmpty()?i:i-stack.lastElement()-1);
                    maxArea = Math.max(maxArea,curArea);
                    System.out.println(curArea+","+maxArea+","+a[top]+","+stack.size());


                }
            }
           stack.push(i);
        }
        return maxArea;
    }

    public static void main(String[] args) {
//        int[] a= {3,1,3,2,2,0};
//        int[] a= {1,2,3,4,5,0};
        char[][] b = {{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};

        System.out.println(maximalRectangle(b));
    }
}
