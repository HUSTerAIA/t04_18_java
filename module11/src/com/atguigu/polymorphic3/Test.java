package com.atguigu.polymorphic3;

/**
 * 多态优势
 */
public class Test {
    public static void main(String[] args) {

        Animal animal=new Dog();            // 多态，animal>dog
        animal.eat();   //狗的重写

        Cat cat=new Cat();
        cat.method();
        method(cat);        // 调用本类静态方法，直接调用

    }

    /*
    形参传递父类类型，接收任意子类对象
     */
    public static void method(Animal animal){   //Animal animal cat->多态，向上转型
        animal.eat();   //调用子类cat对象的重写方法

    }
}
