package com.atgiugu.object1;


import java.util.ArrayList;

public class Object1 {
    public static void main(String[] args) {
        /*
        地址值，list元素
         */

        Person p=new Person("adahg",18);
        System.out.println(p);
        System.out.println(p.toString());

        System.out.println("==========");

        ArrayList<String> list=new ArrayList<>();
        list.add("张三");
        list.add("李四");
        System.out.println(list);
        System.out.println(list.toString());
    }
}
