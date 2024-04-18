package com.aiguigu.object;

public class Demo4Object {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "李四";
        System.out.println(person1);
        System.out.println(person1.name);

        Person person2 = person1;
        System.out.println(person2);
        person2.name = "张三";
        System.out.println(person2.name);
    }
}
