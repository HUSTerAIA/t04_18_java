package com.atgiugu.object2;

public class Object1 {
    public static void main(String[] args) {
        Person p=new Person("abc",123);
        Person p2=new Person("abc",123);
        //equals判断
        System.out.println(p==p2);      // 神队引用数据类型，比较地址值
        System.out.println(p.equals(p2));       // equals重写，比较内容


        //equals重写

        String s1="abc";
        String s2="abc";        // 共享地址值
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));      // String重写，比较内容

    }
}
