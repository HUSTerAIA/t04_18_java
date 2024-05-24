package com.atguigu.recursion;

public class Demo3Recursion {
    public static void main(String[] args) {
        int result=method(5);
        System.out.println("result = " + result);
    }
    public static int method(int n){
        /*
        斐波那契数列
         */
        if(n==1||n==2){
            return 1;       // 出口
        }
        return method(n-2)+method(n-1);
    }
}
