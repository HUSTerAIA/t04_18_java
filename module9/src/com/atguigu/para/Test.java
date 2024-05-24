package com.atguigu.para;

public class Test {
    public static void main(String[] args) {
        int a=5;
        int b=6;
        method(a,b);        // 基本数据类型作为参数传递，传递的是数值
        System.out.println("b = " + b);
        
        int[] arr={1,2};
        method1(arr);       // 引用数据类型传递地址值，地址内的数据被改变
        System.out.println("arr[0] = " + arr[0]);
    }
    public static void method(int a, int b) {
        a+=10;
        b-=10;
        System.out.println("a = " + a);
    }

    public static void method1(int[] arr){
        arr[0]+=10;
        System.out.println("arr[0] = " + arr[0]);
    }


}
