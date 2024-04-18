package com.atguigu.method;

import java.util.Scanner;

public class Demo4Method {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        String result=method(a);
        System.out.println("result = " + result);
    }
    /*
    键盘录入整数，判断奇偶性，返回
     */
    public static String method(int a) {
        if(a%2==0){
            return "偶数";
        }else{
            return "奇数";
        }

    }

}
