package com.aiguigu.object;

import java.util.Arrays;

public class Demo2Object {
    public static void main(String[] args) {
        Person person=new Person();
        System.out.println(person.name);
        System.out.println(person.age);
        person.name="张三";
        person.age=18;
        System.out.println(person.name);
        System.out.println(person.age);

        person.eat("饭");
        int hour=person.sleep();
        System.out.println("睡觉"+hour+"小时");

    }
}
