package com.atguigu.extends3;

public class Zi extends Fu {
    int numZi=100;
    int num=1000;

    public void methodZi(){
        System.out.println("子类方法Zi");

    }
@Override
    public void method(){
        System.out.println("重写，子类方法");
    }
}
