package me.eno.algorithm.lambda;

public class LambdaTest {
    public static void main(String[] args) {
        LambdaTest lt = new LambdaTest();
        MathOperation add = (int a,int b) -> a+b;
        MathOperation sub = (a,b) -> a-b;
        System.out.println(lt.operate(3,1,add));
        System.out.println(lt.operate(3,1,sub));
    }

    interface MathOperation {
        int operation(int a, int b);
    }

    interface GreetingService {
        void sayMessage(String message);
    }

    private int operate(int a, int b, MathOperation mathOperation){
        return mathOperation.operation(a, b);
    }
}
