package com.atguigu.reflect3;

import java.lang.reflect.Field;

public class Reflect0 {
    public static void main(String[] args) throws Exception {
        //获取所有public
        Class<Person0> personClass = Person0.class;
        Field[] fileds = personClass.getFields();
        for (Field f : fileds) {
            System.out.println("f = " + f);
        }
        System.out.println("--------------------");
        //获取所有属性，包括private
        Field[] fileds1 = personClass.getDeclaredFields();
        for (Field f : fileds1) {
            System.out.println("f = " + f);
        }
    }
}
