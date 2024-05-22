package com.aiguigu.object;

import java.util.Arrays;

public class Demo2Object {
    public static void main(String[] args) {
        Person person=new Person();     // 构造对象
        System.out.println(person.name);        //初始默认值
        System.out.println(person.age);
        person.name="张三";       //成员变量赋值
        person.age=18;
        System.out.println(person.name);
        System.out.println(person.age);

        person.eat("饭");
        int hour=person.sleep();
        System.out.println("睡觉"+hour+"小时");

    }
}
