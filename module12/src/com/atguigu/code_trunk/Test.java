package com.atguigu.code_trunk;

public class Test {
    public static void main(String[] args) {
        Person p=new Person();
        System.out.println("==============");
        Person p1=new Person();
        // 静态代码块>构造代码块>构造方法，同一个类中静态代码块只会执行一次
    }
}
