package com.atguigu.static2;

public class Test {
    public static void main(String[] args) {
        //静态访问非静态
        Student s1 = new Student();
        s1.eat();       //访问非静态方法，new对象
        s1.age=18;

        //静态访问静态
        method();       //访问静态方法，直接调用
        Student.drink();        //访问静态方法，直接调用

    }
    public static void method(){
        //静态访问非静态
        Student s1 = new Student();
        s1.age=16;      // 访问非静态变量，new对象

    }

    public void method1(){
        //非静态访问静态
        method();       // 访问静态方法，直接调用
        Student.drink();



    }

    public void method2(){
        //非静态访问非静态
        new Test().method1();       // 访问非静态方法，new对象
        method1();                  // 访问同一个类中的非静态对象，可以直接调用
        Student s1 = new Student();
        s1.age=18;      //访问非静态变量，new对象
    }
}
