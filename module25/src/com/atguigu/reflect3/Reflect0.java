package com.atguigu.reflect3;

import java.lang.reflect.Field;

/**
 * 获取成员属性
 */
public class Reflect0 {
    public static void main(String[] args) throws Exception {
        //获取所有public
        Class<Person0> personClass = Person0.class;
        Field[] fileds = personClass.getFields();       // 所有public成员变量
        for (Field f : fileds) {
            System.out.println("f = " + f);
        }
        System.out.println("--------------------");
        //获取所有属性，包括private
        Field[] fileds1 = personClass.getDeclaredFields();      // 所有属性
        for (Field f : fileds1) {
            System.out.println("f = " + f);
        }
    }
}
