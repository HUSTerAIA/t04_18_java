package com.atguigu.class2;

public class Test {
    public static void main(String[] args) {
        //抽象类作为方法参数传递
        Animal animal=new Dog();    //多态，new子类对象
        method(animal);     //static引用static

        //抽象类作为返回值
        Animal animal2=method2();
        animal2.eat();
    }

    //抽象类作为方法参数传递
    public static void method(Animal animal) {
        animal.eat();
    }

    public static Animal method2(){
        Animal animal=new Dog();
        return animal;
    }
}
