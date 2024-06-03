package com.atguigu.reflect4;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

public class Reflect0 {
    public static void main(String[] args) throws Exception {
        /*
        1.创建properties集合
        2.读取配置文件，解析配置
        3.根据解析的classname创建class对象
        4.根据解析的method创建对应方法
        5.执行方法
         */
        Properties prop = new Properties();
        InputStream in =
                Reflect0.class.getClassLoader().getResourceAsStream("prop.properties");     // 0.prop配置文件放在自己创建的模块下的resource文件夹下
        prop.load(in);

//        System.out.println(prop);   //测试

        String className = prop.getProperty("className");       // 1.获取文件中的指定属性
        Class<?> class1 = Class.forName(className);     // 2.创建类对象
        Object o = class1.newInstance();        // 3.构造

        String methodName = prop.getProperty("methodName");     //4.获取文件中的指定属性
        Method method = class1.getMethod(methodName);       // 5.获取方法

        method.invoke(o);       // 6.执行方法


    }
}
