package com.atguigu.io1;

import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * 转换流
 * input读取文件
 */
public class IO1 {
    public static void main(String[] args)throws Exception{
        //读取数据
        InputStreamReader isr=new InputStreamReader(new FileInputStream("io\\7.txt"),"gBk");
        int data=isr.read();
        System.out.println((char)data);
        isr.close();
    }
}
