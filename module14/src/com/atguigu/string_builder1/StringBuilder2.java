package com.atguigu.string_builder1;

import java.util.Scanner;

public class StringBuilder2 {
    public static void main(String[] args) {
        /*
        判断回文
         */
        //字符串录入
        System.out.println("输入字符串");
        Scanner sc=new Scanner((System.in));
        String s=sc.next();
        //转成StringBuilder
        StringBuilder sb=new StringBuilder(s);
        //翻转
        sb.reverse();
        //转换
        String s1=sb.toString();        // 同类型比较
        //比较
        if(s.equals(s1)){
            System.out.println("回文");
        }else {
            System.out.println("不是回文");
        }


    }
}
