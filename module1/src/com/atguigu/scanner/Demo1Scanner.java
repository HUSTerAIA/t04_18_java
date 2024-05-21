package com.atguigu.scanner;

import java.util.Scanner;       //导入包

public class Demo1Scanner {
    public static void main(String[] args) {
        //录入整数
        Scanner sc=new Scanner(System.in);      // 创建对象  int a=...
        int data1=sc.nextInt();     //整数
        System.out.println("data1="+data1);

        //字符串录入
        String data2=sc.next();     // 字符串
        System.out.println("data2 = " + data2);
    }
}
