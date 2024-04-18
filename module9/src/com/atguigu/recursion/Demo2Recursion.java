package com.atguigu.recursion;

public class Demo2Recursion {
    public static void main(String[] args) {
        int result=method(5);
        System.out.println("result = " + result);
    }
    public static int method(int n){
        /*
        阶乘
         */
        if(n==1){
            return 1;
        }
        return n*method(n-1);
    }
}
