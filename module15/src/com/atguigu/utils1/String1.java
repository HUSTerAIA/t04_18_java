package com.atguigu.utils1;

public class String1 {
    public static void main(String[] args) {
        //string类型转换
        int i=100;
        String s=i+"";      // 字符串拼接
        System.out.println("s = " + s);

        // 数据类型转换
        String s2=String.valueOf(i);
        System.out.println("s2+10 = " + (s2+10));

        //int->string
        int num1=Integer.parseInt(s);
        System.out.println("num1+1 = " + (num1+1));
    }
}
