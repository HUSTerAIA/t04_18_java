package com.atguigu.if1;

import java.util.Scanner;

public class Demo1If {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个年份：");
        int year=sc.nextInt();
        if ((year%4==0 &&year%100!=0)||(year%400==0)){
            System.out.println("闰年");
        }else {
            System.out.println("不是闰年");
        }
    }
}
