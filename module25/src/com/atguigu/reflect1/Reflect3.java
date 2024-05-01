package com.atguigu.reflect1;

import java.lang.reflect.Constructor;

public class Reflect3 {
    public static void main(String[] args) {
        Class<Person0> personClass = Person0.class;
        //获取全部构造：公有、私有
        Constructor<?>[] dc = personClass.getDeclaredConstructors();
        for (Constructor<?> cons : dc) {
            System.out.println(cons);
        }
    }
}
