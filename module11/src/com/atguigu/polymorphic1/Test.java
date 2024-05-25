package com.atguigu.polymorphic1;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
        cat.method();

        Dog dog = new Dog();
        dog.eat();
        dog.method();

        //多态
        Animal animal=new Cat();
        animal.eat();   //调用的是cat的方法，访问成员方法，看等号右边对象
//        animal.method();    //不能直接调用子类特有方法

    }
}
