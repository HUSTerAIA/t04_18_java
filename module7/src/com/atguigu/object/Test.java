package com.atguigu.object;

public class Test {
    public static void main(String[] args) {
        Person person=new Person();
        person.age=18;
        person.name="张三";
        person.animal.name="汪汪";

        person.animal1=new Animal();
        person.animal1.age=5;   //链式调用

        System.out.println(person.age+","+person.animal.name+","+person.animal1.age);
    }
}
