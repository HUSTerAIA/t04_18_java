package com.atguigu.string3;

import java.io.UnsupportedEncodingException;

public class String1 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "abcdef";
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
        System.out.println("===========");
        byte[] bytes = s.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        System.out.println("===========");
        String s1 = s.replace('a', 'A');
        System.out.println(s1.toString());
        System.out.println("===========");
        byte[] bytes1 = "你好".getBytes("gbk");
        for (int i = 0; i < bytes1.length; i++) {
            System.out.println(bytes1[i]);
        }
        System.out.println("===========");
        byte[] bytes2 = s.getBytes("UTF-8");  //不区分大小写
        for (int i = 0; i < bytes2.length; i++) {
            System.out.println(bytes2[i]);
        }
    }
}
