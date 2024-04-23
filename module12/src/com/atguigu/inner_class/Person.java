package com.atguigu.inner_class;


public class Person {
    //静态内部类
    static class Inner1{
        public void method(){
            System.out.println("内部静态类");
        }
    }

    //非静态内部类
    class Inner2{
        public void method(){
            System.out.println("非静态内部类");
        }
    }
}
