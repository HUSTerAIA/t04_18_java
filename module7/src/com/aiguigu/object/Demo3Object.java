package com.aiguigu.object;

public class Demo3Object {
    public static void main(String[] args) {
        new Person().name="李四";     // 匿名对象
        System.out.println( new Person().name);     //重新分配了一个对象，初始值null

    }
}
