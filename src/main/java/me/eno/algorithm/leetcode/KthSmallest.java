package me.eno.algorithm.leetcode;

public class KthSmallest {
    public static int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        if (n ==1){
            return matrix[0][0];
        }
        int left = matrix[0][0];
        int right = matrix[n-1][n-1];
        while(left <= right) {
            //取中位【】
            //int mid = left + (right -left ) / 2;
            int mid = (left+right)/2;
            //最小位置
            int less = getLess(matrix, mid);
            if(less < k){
                //处于左边
                left = mid + 1;
            }else{
                //处于右边
                right = mid - 1;
            }
        }

        return left;
    }

    //获取mid处于位数
    private static int getLess(int matrix[][], int mid) {
        int res = 0;
        int n = matrix.length;

        int a = n-1, b = 0;
        while(a >=0 && b < n) {
            if(matrix[a][b] > mid){
                a--;
            }else {
                res += a + 1;
                b++;
            }
        }
        return res;
    }

//        PriorityQueue<Integer> pq = new PriorityQueue(matrix.length*matrix.length);
//        for (int x = 0; x < matrix.length; x++) {
//                for (int y = 0; y < matrix[x].length; y++) {
//                    pq.add(matrix[x][y]);
//                }
//            }
//            Integer w = 0;
//            for (int i = 0; i<k; i++){
//
//
//            w = pq.poll();
//            }
//        return w;
//    }

    public static void main(String[] args) {
//        int[][] a = {{1,  5,  9},{10, 11, 13},{12, 13, 15}};

//        int[][] a = {{1,2},{1,3}};
        int[][] a = {{2000000000}};
        System.out.println(System.currentTimeMillis());
        System.out.println(kthSmallest(a,1));
        System.out.println(System.currentTimeMillis());

    }
}
