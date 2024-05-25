package com.atguigu.extends4;

public class Test {
    public static void main(String[] args) {
        Fu fu = new Fu();
        System.out.println("===================");
        Zi zi = new Zi();       // 自动调用父类构造，先初始化父类才能继承
        System.out.println("===================");
        Zi zi1 = new Zi(10);
    }

}
