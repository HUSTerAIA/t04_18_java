package com.atguigu.reflect1;


import java.lang.reflect.Constructor;

/**
 * 暴力反射
 */
public class Reflect4 {
    public static void main(String[] args)throws Exception {
        Class<Person0> personClass = Person0.class;
        Constructor<Person0> dc = personClass.getDeclaredConstructor(String.class);

        dc.setAccessible(true);     //解除私有权限  ->暴力反射
        Person0 p=dc.newInstance("dhsjf");      // private有参构造破解
        System.out.println(p);


    }
}
