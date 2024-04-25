package com.atguigu.string2;

import java.util.Scanner;

public class String4 {

    public static void main(String[] args) {
/*        已知用户名和密码，三次登录机会
        1. 定义初始用户名和密码
        2. 输入用户名和密码
        3. 比较，如果和初始一致则登录成功*/

        String name="root";
        String pwd="123";



        for(int i=0;i<3;i++){
            System.out.println("输入用户名");
            Scanner sc=new Scanner(System.in);
            String name1=sc.next();

            System.out.println("输入密码");
            Scanner sc2=new Scanner(System.in);
            String pwd1=sc2.next();
            if(name1.equals(name) && pwd1.equals(pwd)){
                System.out.println("登录成功");
                break;
            }else{
                if(i==2){
                    System.out.println("账号冻结");
                }else{
                    System.out.println("登录失败，剩余次数"+(3-i-1));
                }

            }
        }


    }
}
