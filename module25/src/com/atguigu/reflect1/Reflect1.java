package com.atguigu.reflect1;

import java.lang.reflect.Constructor;

/**
 * 创造无参对象
 */
public class Reflect1 {
    public static void main(String[] args) throws NoSuchMethodException, InstantiationException, IllegalAccessException {
        //获取class对象
        Class<Person0> personClass = Person0.class;
        //获取空参构造
        Constructor<Person0> cons=personClass.getConstructor();
        System.out.println("cons = " + cons);

        //利用空参构造创建对象
        Person0 p=personClass.newInstance();
        System.out.println("p = " + p);

        //直接利用class对象创建
        System.out.println(personClass.newInstance());
    }
}
