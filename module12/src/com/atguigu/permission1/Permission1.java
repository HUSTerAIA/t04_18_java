package com.atguigu.permission1;

public class Permission1 {
    public int num1=10;
    protected int num2=20;
    int num3=30;
    private int num4=40;

    //同类调用
    public void method(){
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
    }
}
