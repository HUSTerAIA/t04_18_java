package com.atguigu.string2;

public class String2 {
    public static void main(String[] args) {
        String s1="abc";
        String s2="def";
        String s3="abcdef";
        String s4="abc"+"def";
        String s5=s1+"def";
        String s6=s1+s2;
        System.out.println(s3==s4);     // "abcdef"已经被创建，不可变
        System.out.println(s3==s5);
        System.out.println(s3==s6);

    }
}
