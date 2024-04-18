package com.atguigu.switch1;

import java.util.Scanner;

public class Demo3Switch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入一个整数：");
        int data=sc.nextInt();
        switch(data){
            case 12:
            case 1:
            case 2:
                System.out.println("冬季");
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;
            default:
                System.out.println("无效");
                break;
        }
    }
}
