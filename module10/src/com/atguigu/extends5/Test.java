package com.atguigu.extends5;

public class Test {
    public static void main(String[] args) {
        Fu fu = new Fu();
        System.out.println("=====================");

        Zi zi=new Zi();
        System.out.println("=====================");

        Zi zi1=new Zi(10);
        System.out.println("=====================");
        System.out.println(zi.num);
        System.out.println("=====================");

        zi.method();
    }
}
