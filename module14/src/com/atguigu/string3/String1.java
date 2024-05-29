package com.atguigu.string3;

import java.io.UnsupportedEncodingException;

public class String1 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "abcdef";        // 构造string对象
        char[] chars = s.toCharArray();     // 字符串转换成字符，非静态成员
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
        System.out.println("===========");
        byte[] bytes = s.getBytes();        // 转成char
        for (int i = 0; i < bytes.length; i++) {        // length为成员变量
            System.out.println(bytes[i]);
        }
        System.out.println("===========");
        String s1 = s.replace('a', 'A');        // 替换
        System.out.println(s1.toString());
        System.out.println("===========");
        byte[] bytes1 = "你好".getBytes("gbk");       // 按照编码格式转成byte
        for (int i = 0; i < bytes1.length; i++) {
            System.out.println(bytes1[i]);
        }
        System.out.println("===========");
        byte[] bytes2 = s.getBytes("UTF-8");  //编码格式不区分大小写
        for (int i = 0; i < bytes2.length; i++) {
            System.out.println(bytes2[i]);
        }
    }
}
