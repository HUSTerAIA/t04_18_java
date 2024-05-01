package com.atguigu.reflect1;

import java.lang.reflect.Constructor;

public class Reflect2 {
    public static void main(String[] args) throws Exception{
        /*
        利用反射创建有参构造
         */
        //获取class对象
        Class<Person0> person0Class=Person0.class;
        //获取空参构造
        Constructor<Person0> cons=person0Class.getConstructor(String.class,Integer.class);
        //利用反射api创建对象，类比于：Person0 p=new Person0(...)
        Person0 p=cons.newInstance("ahf",78);
        System.out.println("p = " + p);

    }
}
