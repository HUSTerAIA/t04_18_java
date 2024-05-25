package com.atguigu.polymorphic2;

public class Zi extends Fu{
    int num=10; //子类成员变量,继承，重写
    String name="zi";

    public void method(){
        System.out.println("子类重写父类方法");
    }
}
