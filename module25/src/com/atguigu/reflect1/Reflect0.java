package com.atguigu.reflect1;

import java.lang.reflect.Constructor;

public class Reflect0 {
    public static void main(String[] args) {
        //获取class对象
        Class<Person0> pClass=Person0.class;
        //获取所有public的构造
        Constructor<?>[] cons=pClass.getConstructors();
        for(Constructor<?> con:cons){
            System.out.println("con = " + con);
        }
    }
}
