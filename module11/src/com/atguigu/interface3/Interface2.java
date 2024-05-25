package com.atguigu.interface3;

public interface Interface2 {
    /*
    抽象方法
     */
    public abstract void method();

    // 默认方法
    public default void method1(){
        System.out.println("接口2默认方法");
    }
}
