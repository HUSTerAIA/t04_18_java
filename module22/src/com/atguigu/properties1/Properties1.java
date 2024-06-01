package com.atguigu.properties1;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.Set;

/**
 * 配置文件流
 */
public class Properties1 {
    public static void main(String[] args) throws Exception{
        //读取配置文件
        Properties prop=new Properties();
        FileInputStream fis=new FileInputStream("io\\prop.properties"); //配置文件转成字节基本读取流
        prop.load(fis);
        // 遍历输出
        Set<String> set=prop.stringPropertyNames();     // 获取keys
        for(String key:set){
            System.out.println(key+"="+prop.getProperty(key));      // 根据key找value
        }

    }
}
