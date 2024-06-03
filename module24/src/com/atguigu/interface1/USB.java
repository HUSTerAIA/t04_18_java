package com.atguigu.interface1;

// 函数式接口
@FunctionalInterface
public interface USB {
    //定义函数式接口：只有一个抽象方法
    void open(String s);        // 抽象方法，public abstract默认存在
//    void method();
}
