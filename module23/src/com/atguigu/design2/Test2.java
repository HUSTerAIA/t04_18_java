package com.atguigu.design2;

public class Test2 {
    public static void main(String[] args) {
        Singleton2 singleton1 = Singleton2.getSingleton();
        Singleton2 singleton2 = Singleton2.getSingleton();
        System.out.println("singleton1 = " + singleton1);
        System.out.println("singleton2 = " + singleton2);
    }
}
