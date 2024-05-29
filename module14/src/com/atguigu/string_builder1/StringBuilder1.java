package com.atguigu.string_builder1;

public class StringBuilder1 {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder();
        System.out.println(sb1);
        StringBuilder sb2=new StringBuilder("sdhf2");
        System.out.println(sb2);

        System.out.println("============");

        StringBuilder sb3=new StringBuilder();
        sb3.append("sdhfer");
        System.out.println(sb3);
        StringBuilder sb4=new StringBuilder("sdhfer");
        System.out.println(sb4);
        System.out.println(sb3==sb4);       // 两者地址值一致

        StringBuilder sb5=sb4.append("24vsd");
        System.out.println(sb4==sb5);
        System.out.println("=============");
        //链式调用
        sb4.append("2435").append("sdfh");
        System.out.println(sb4);

        System.out.println(sb4.reverse());
        String s=sb4.toString();        // 类型转换
        System.out.println(s);

    }
}
