package com.atguigu.abstract1;

public class Test {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.eat();      // 重写抽象方法

        Cat cat=new Cat();
        cat.eat();


        Dog dog2=new Dog("汪汪", 10);     // 调用由出纳构造
        System.out.println(dog2.getName()+"..."+dog2.getAge());
    }
}
