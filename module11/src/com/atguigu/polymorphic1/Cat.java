package com.atguigu.polymorphic1;

public class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    //特有方法
    public void method(){
        System.out.println("猫特有");
    }
}
