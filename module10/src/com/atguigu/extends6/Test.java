package com.atguigu.extends6;

public class Test {
    public static void main(String[] args) {
        Zi zi = new Zi();
        System.out.println("===========");
        Zi zi1 = new Zi(10);
        System.out.println("===========");
        zi.method();
        System.out.println("===========");
        zi.method1(10000);
    }
}
