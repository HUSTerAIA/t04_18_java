package com.atguigu.polymorphic4;

public class Dog extends Animal {
    public void eat(){
        System.out.println("狗吃肉");
    }   //重写

    //特有方法
    public void method(){
        System.out.println("狗特有");
    }
}
