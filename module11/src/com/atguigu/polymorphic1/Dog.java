package com.atguigu.polymorphic1;

public class Dog extends Animal{    // 继承
    public void eat(){
        System.out.println("狗吃肉");
    }       // 重写抽象方法

    //特有方法
    public void method(){
        System.out.println("狗特有");
    }
}
