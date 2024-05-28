package com.atguigu.inner_class2;

public class Person {
    public void eat(){
        //局部内部类，类->方法->局部内部类
        class Heart{
            public void method(){
                System.out.println("局部内部类");
            }
        }

        //对象调用
        new Heart().method();
    }
;}
