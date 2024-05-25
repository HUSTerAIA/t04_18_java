package com.atguigu.abstract1;

public class Dog extends Animal{    // 继承
    @Override
    public void eat(){
        // 继承父类，重写所有抽象方法
        System.out.println("狗吃肉");
    }

    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }


}
