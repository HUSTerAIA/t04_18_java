package com.atguigu.static2;

public class Test {
    public static void main(String[] args) {
        //静态访问非静态
        Student s1 = new Student();
        s1.eat();
        s1.age=18;

        //静态访问静态
        method();
        Student.drink();

    }
    public static void method(){
        //静态访问非静态
        Student s1 = new Student();
        s1.age=16;

    }

    public void method1(){
        //非静态访问静态
        method();
        Student.drink();



    }

    public void method2(){
        //非静态访问非静态
        new Test().method1();
        method1();
        Student s1 = new Student();
        s1.age=18;
    }
}
