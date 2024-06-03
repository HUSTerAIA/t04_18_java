package com.atguigu.design2;

/**
 * 单例模式
 */
public class Test2 {
    public static void main(String[] args) {
        Singleton2 singleton1 = Singleton2.getSingleton();
        Singleton2 singleton2 = Singleton2.getSingleton();      // 直接返回同一个对象
        System.out.println("singleton1 = " + singleton1);
        System.out.println("singleton2 = " + singleton2);
    }
}
