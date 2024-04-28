package com.atguigu.hash1;

import com.atguigu.collections1.Person2;

public class Hash1 {
    public static void main(String[] args) {
        Person1 p1=new Person1("shdf",26);
        Person1 p2=new Person1("shdf",26);
        System.out.println(p1);
        System.out.println(p2);     //没有重写hash代表地址值,重写代表内容值

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());

        System.out.println("================");
        String s="shjgf";
        String s1="iuireikjv";
        System.out.println(s1.hashCode());      //String重写
        System.out.println(s.hashCode());

        System.out.println("==================");
        String s2="通话";
        String s3="重地";
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
    }
}
