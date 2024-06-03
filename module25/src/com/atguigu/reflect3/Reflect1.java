package com.atguigu.reflect3;

import java.lang.reflect.Field;

/**
 * 暴力反射
 */
public class Reflect1 {
    public static void main(String[] args) throws Exception {
//        get1();
        get2();

    }

    /**
     * 获取指定public属性
     */
    public static void get1() throws Exception {
        Class<Person0> personClass = Person0.class;
        Person0 p = personClass.newInstance();
        Field filed = personClass.getField("salary");
        //调用set方法为属性赋值
        filed.set(p, 100.0);
        //调用get方法
        Object o = p.getSalary();
        System.out.println("o = " + o);
    }

    /**
     * 获取指定private属性
     */
    public static void get2() throws Exception {
        Class<Person0> personClass = Person0.class;
        Person0 p = personClass.newInstance();
        Field filed = personClass.getDeclaredField("age");
        filed.setAccessible(true);      // 先解除权限
        //调用set方法为属性赋值
        filed.set(p, 20);
        //调用get方法
        Object o = p.getAge();
        System.out.println("o = " + o);
    }
}
