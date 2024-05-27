package com.atguigu.permission1;

public class Permission1 {
    public int num1=10;     // 公用
    protected int num2=20;  // 保护
    int num3=30;            // 默认：空
    private int num4=40;    // 私有

    //同类调用
    public void method(){
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
    }
}
