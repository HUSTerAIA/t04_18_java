package com.atguigu.utils1;

public class String1 {
    public static void main(String[] args) {
        //string类型转换
        int i=100;
        String s=i+"";
        System.out.println("s = " + s);

        String s2=String.valueOf(i);
        System.out.println("s2+10 = " + (s2+10));

        //int->string
        int num1=Integer.parseInt(s);
        System.out.println("num1+1 = " + (num1+1));
    }
}
