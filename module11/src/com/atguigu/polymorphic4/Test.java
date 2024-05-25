package com.atguigu.polymorphic4;

public class Test {
    public static void main(String[] args) {
        //多态new对象：向上转型
        Animal animal=new Dog();
        animal.eat();   //调用子类重写方法

        //向下转型
        Dog dog=(Dog)animal;
        dog.method();   //调用子类特有功能
    }
}
