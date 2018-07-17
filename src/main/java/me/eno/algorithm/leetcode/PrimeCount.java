package me.eno.algorithm.leetcode;

import java.math.BigInteger;

public class PrimeCount {
    public int countPrimeSetBits(int L, int R) {
        int count = 0;
        for (int j = L; j<=R; j ++){
            int cnt=Integer.bitCount(j);

            if (isPrime(cnt)){
                count++;
            }
        }
        return count;

    }

    public static int getBits(int k){
        BigInteger bi = BigInteger.valueOf(k);
        int count = 0;
        for (int i=0; i<k/2+1; i++){
            if (bi.testBit(i)){
                count++;
            }
        }
        return count;
    }

    public static boolean isPrime(int x){
        return (x == 2 || x == 3 || x == 5 || x == 7 ||
                x == 11 || x == 13 || x == 17 || x == 19);
    }

    public static void main(String[] args) {
        PrimeCount pc = new PrimeCount();
        System.out.println(System.currentTimeMillis());
        System.out.println(pc.countPrimeSetBits(541055,543993));
        System.out.println(System.currentTimeMillis());
    }
}
