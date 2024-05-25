package com.atguigu.abstract1;

public class Cat extends Animal{    // 继承
    public Cat() {
        super();

    }
    public Cat(String name, int age) {
        // 有参构造
        super(name, age);
    }

    public void eat(){
        // 继承父类，重写抽象方法
        System.out.println("猫吃鱼");
    }
}
