package com.atguigu.class2;

//抽象类继承
public class Dog extends Animal{        // 继承
    @Override   //重写抽象方法
    public void eat(){
        System.out.println("狗吃肉");
    }
}
