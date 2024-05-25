package com.atguigu.extends2;

public class Test {
    public static void main(String[] args) {
        Fu fu=new Fu();
//        fu.num=1;
        System.out.println(fu.num);

        Zi zi=new Zi();
        System.out.println(zi.num);     // 重写
        System.out.println(zi.numFu);       // 继承


        fu.methodFu();
        fu.method();

        zi.methodZi();
        zi.method();
    }
}
