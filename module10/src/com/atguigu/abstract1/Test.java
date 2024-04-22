package com.atguigu.abstract1;

public class Test {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.eat();

        Cat cat=new Cat();
        cat.eat();


        Dog dog2=new Dog("汪汪", 10);
        System.out.println(dog2.getName()+"..."+dog2.getAge());
    }
}
