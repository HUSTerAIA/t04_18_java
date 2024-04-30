package com.atguigu.new_chara01;

public class Demo0 {
    public static void main(String[] args) {
        Dog dog=new Dog();
        method(dog);
    }
    public static void method(Animal1 animal){
        if(animal instanceof Dog dog){
            dog.eat();
            dog.sleep();
        }
    }
}
