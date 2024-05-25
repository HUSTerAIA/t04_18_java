package com.atguigu.extends3;

public class Test {
    public static void main(String[] args) {
        Fu fu=new Fu();
//        fu.num=1;
//        System.out.println(fu.num);

        Zi zi=new Zi();
//        System.out.println(zi.num);
//        System.out.println(zi.numFu);


        fu.methodFu();
        fu.method();

        zi.methodZi();
        zi.methodFu();      // 继承
        zi.method();
    }
}
