package com.atguigu.recursion;

public class Demo1Recursion {
    public static void main(String[] args) {
        method(5);      // 静态方法

    }
    public static void method(int n){
        System.out.println(n);
        n--;
        if(n<0){
            //递归出口，结束方法
            return;
        }
        method(n);      // 方法内部自己调用自己，递归
    }
}
