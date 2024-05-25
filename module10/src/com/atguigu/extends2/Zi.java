package com.atguigu.extends2;

public class Zi extends Fu{
    int numZi=100;
    int num=1000;       // 重写父类成员变量

    public void methodZi(){
        System.out.println("子类方法Zi");

    }

    public void method(){
        System.out.println("重写，子类方法");
    }
}
