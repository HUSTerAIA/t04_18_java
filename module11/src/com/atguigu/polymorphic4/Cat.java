package com.atguigu.polymorphic4;

public class Cat extends Animal {
    @Override   //重写
    public void eat() {
        System.out.println("猫吃鱼");
    }

    //特有方法
    public void method(){
        System.out.println("猫特有");
    }
}
