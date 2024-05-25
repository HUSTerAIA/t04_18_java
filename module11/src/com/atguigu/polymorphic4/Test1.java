package com.atguigu.polymorphic4;

public class Test1 {
    public static void main(String[] args) {
        //多态
        Dog dog = new Dog();
        method(dog);
        System.out.println("---------------------");
        Cat cat=new Cat();
        method(cat);

    }

    public static void method(Animal animal) {      // 向上转型
        animal.eat();

        if (animal instanceof Dog) {  //判断animal是否为Dog类型
            ((Dog) animal).method();        // 向下转型
        } else if (animal instanceof Cat) {
            Cat cat = (Cat) animal;   //向下转型
            cat.method();
        }


    }
}
