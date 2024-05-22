package com.atguigu.method;

import java.util.Scanner;

public class Demo4Method {
    public static void main(String[] args) {
        System.out.println("输入一个数字：");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        String result=method(a);
        System.out.println("result = " + result);
    }
    /**
    *键盘录入整数，判断奇偶性，返回
     */
    public static String method(int a) {
        /*
        有参有返回值
         */
        if(a%2==0){
            return "偶数";
        }else{
            return "奇数";
        }

    }

}
