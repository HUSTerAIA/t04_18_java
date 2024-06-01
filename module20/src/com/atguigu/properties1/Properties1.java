package com.atguigu.properties1;

import java.util.Properties;
import java.util.Set;

public class Properties1 {
    public static void main(String[] args) {
        Properties prop=new Properties();       // 双列集合map：默认键值对泛型string
        //存入集合
        prop.setProperty("abc","2467");
        prop.setProperty("ewvbc","w4468");
        prop.setProperty("sdew","we6368");
        System.out.println(prop);
        //根据key获取value
        String value=prop.getProperty("abc");
        System.out.println("value = " + value);
        //获取所有key
        Set<String> set1=prop.stringPropertyNames();
        for(String key:set1){
            System.out.println(key);
        }
    }
}
