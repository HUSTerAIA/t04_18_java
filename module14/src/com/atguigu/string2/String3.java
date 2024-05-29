package com.atguigu.string2;

public class String3 {
    public static void main(String[] args) {
        String s1="abc";
        String s2=new String("abc");
        String s3="ABc";

        System.out.println(s1==s2);     // 地址值一致
        System.out.println(s1.equals(s2));  // equals比较内容
        System.out.println(s1.equals(s3)) ;
    }
}
