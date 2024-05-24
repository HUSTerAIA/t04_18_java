package com.atguigu.static2;

public class Student {
    int age;

    public void eat(){
        // 非静态
        System.out.println("吃饭");
    }

    public static void drink(){
        // 静态
        System.out.println("喝水");
    }
}
