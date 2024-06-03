package com.atguigu.reflect1;

import java.lang.reflect.Constructor;

/**
 * 获取class的public无参构造方法
 */
public class Reflect0 {
    public static void main(String[] args) {
        //获取class对象
        Class<Person0> pClass=Person0.class;
        //获取所有public的构造
        Constructor<?>[] cons=pClass.getConstructors();     // 访问权限为公有的无参构造方法
        for(Constructor<?> con:cons){
            System.out.println("con = " + con);     // integer无参构造，Person自身无参构造
        }
    }
}
