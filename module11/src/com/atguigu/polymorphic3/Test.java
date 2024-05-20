package com.atguigu.polymorphic3;

public class Test {
    public static void main(String[] args) {

        Animal animal=new Dog();
        animal.eat();   //狗的重写

        Cat cat=new Cat();
        method(cat);

    }

    /*
    形参传递父类类型，接收任意子类对象
     */
    public static void method(Animal animal){   //Animal animal cat->多态
        animal.eat();   //调用子类对象的重写方法

    }
}
