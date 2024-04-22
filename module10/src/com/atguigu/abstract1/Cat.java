package com.atguigu.abstract1;

public class Cat extends Animal{
    public Cat() {
        super();

    }
    public Cat(String name, int age) {
        super(name, age);
    }

    public void eat(){
        System.out.println("猫吃鱼");
    }
}
