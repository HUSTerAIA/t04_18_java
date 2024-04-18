package com.atguigu.pack2;

public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person+"------");
        person.name="张三";
        person.speak("李四");

        Person person1 = new Person();
        System.out.println(person1+"+++++++++");
        person1.speak("王五");

    }
}
