package com.aiguigu.object;

public class Demo4Object {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "李四";
        System.out.println(person1);        // 对象的地址值
        System.out.println(person1.name);

        Person person2 = person1;       // 地址值指向p1
        System.out.println(person2);
        person2.name = "张三";            //该地址的对象成员变量重新赋值
        System.out.println(person2.name);
        System.out.println(person1.name);
    }
}
