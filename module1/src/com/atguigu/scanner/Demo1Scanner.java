package com.atguigu.scanner;

import java.util.Scanner;

public class Demo1Scanner {
    public static void main(String[] args) {
        //录入整数
        Scanner sc=new Scanner(System.in);
        int data1=sc.nextInt();
        System.out.println("data1="+data1);

        //字符串录入
        String data2=sc.next();
        System.out.println("data2 = " + data2);
    }
}
