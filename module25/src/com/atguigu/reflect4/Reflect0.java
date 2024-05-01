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
                Reflect0.class.getClassLoader().getResourceAsStream("prop.properties");
        prop.load(in);

//        System.out.println(prop);   //测试

        String className = prop.getProperty("className");
        Class<?> class1 = Class.forName(className);
        Object o = class1.newInstance();

        String methodName = prop.getProperty("methodName");
        Method method = class1.getMethod(methodName);

        method.invoke(o);


    }
}
