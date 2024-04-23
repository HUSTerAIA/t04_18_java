package com.atguigu.inner_class;

public class Test {

    public static void main(String[] args) {
        //调用内部静态类
        Person.Inner1 inner1=new Person.Inner1();
        inner1.method();

        Person.Inner2 inner2=new Person().new Inner2();
        inner2.method();
    }

}
