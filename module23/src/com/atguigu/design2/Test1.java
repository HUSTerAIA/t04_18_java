package com.atguigu.design2;

public class Test1 {
    public static void main(String[] args) {
        Singleton1 singleton1 = Singleton1.getSingleton();
        Singleton1 singleton2 = Singleton1.getSingleton();
        System.out.println("singleton1 = " + singleton1);
        System.out.println("singleton2 = " + singleton2);
    }
}
