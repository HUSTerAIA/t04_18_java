package com.atgiugu.exception2;

import java.util.Scanner;

public class Exception1 {
    public static void main (String[] args) throws LoginException1{
        //自定义异常
        String name="abc";      //已存在的用户名
        System.out.println("输入用户名");    //提示信息
        Scanner sc=new Scanner(System.in);  //录入
        String name1=sc.next();
        //判断用户名是否存在
        if (name1.equals(name)){
            System.out.println("登录成功");
        }else{
            //自定义异常
            throw new LoginException1("异常");        // 自定义创建，传递message
        }
    }
}
