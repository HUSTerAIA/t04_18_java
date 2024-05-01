package com.atguigu.reflect3;

import java.lang.reflect.Field;

public class Reflect1 {
    public static void main(String[] args) throws Exception {
        //获取所有public
        Class<Person0> personClass = Person0.class;
        Field[] filed = personClass.getField();

        System.out.println("--------------------");
        //获取所有属性，包括private
        Field[] fileds1 = personClass.getDeclaredFields();

    }
}
