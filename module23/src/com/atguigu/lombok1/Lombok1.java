package com.atguigu.lombok1;

public class Lombok1 {
    public static void main(String[] args) {
        Person1 p1 = new Person1("abc", 18);
        Person1 p2 = new Person1("ac", 17);

        System.out.println(p1.getName() + ".." + p1.getAge());
        System.out.println(p2.getName() + ".." + p2.getAge());
    }
}
