package com.atguigu.scanner;

import java.util.Scanner;

public class Demo2Scanner {
    public static void main(String[] args) {
        //录入整数
        Scanner sc=new Scanner(System.in);
        System.out.print("年龄1：");
        int old1=sc.nextInt();
        System.out.print("年龄2：");
        int old2 =sc.nextInt();
        System.out.print("年龄3：");
        int old3 =sc.nextInt();

        int temp=old1>old2?old1:old2;
        int max=temp>old3?temp:old3;
        System.out.println("年龄最大为："+max);

    }
}
