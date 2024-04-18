package com.atguigu.switch1;

import java.util.Scanner;

public class Demo1Switch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入一个整数：");
        int data=sc.nextInt();
        switch(data){
            case 1:
                System.out.println("测试1");
                break;
            case 2:
                System.out.println("测试2");
                break;
            default:
                System.out.println("无效");
                break;
        }
    }
}
