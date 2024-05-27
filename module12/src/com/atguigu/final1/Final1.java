package com.atguigu.final1;

public final class Final1 { // 修饰类
    final String str="final str";

    public static void main(String[] args) {
        final float A =12.F;     // 修饰常量
        System.out.println("A = " + A);
        method();
    }
    public static final void method(){     // 修饰方法
        final int num=1;        // 修饰常量
        System.out.println("This is a final method   "+num);
        final Final1 obj=new Final1();      // 修饰对象
        System.out.println("str = " + obj.str);
    }

}
