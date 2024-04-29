package com.atguigu.properties1;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.Set;

public class Properties1 {
    public static void main(String[] args) throws Exception{
        //读取配置文件
        Properties prop=new Properties();
        FileInputStream fis=new FileInputStream("io\\prop.properties");
        prop.load(fis);
        Set<String> set=prop.stringPropertyNames();
        for(String key:set){
            System.out.println(key+"="+prop.getProperty(key));
        }




    }
}
