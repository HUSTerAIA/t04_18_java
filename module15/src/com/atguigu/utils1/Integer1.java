package com.atguigu.utils1;

public class Integer1 {
    public static void main(String[] args) {
        //integer基本使用
//        static Integer valueOf(int i);
//        static Integer valueOf(String s)；
        Integer num1=Integer.valueOf(232);      // inyo
        System.out.println("num1="+num1);

        Integer num2=Integer.valueOf("34673");
        System.out.println("num2 = " + num2);

        //拆箱
        int num3=num2.intValue();
        System.out.println("num3+10 = " + (num3+10));

    }
}
