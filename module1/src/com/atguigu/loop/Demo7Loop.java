package com.atguigu.loop;

import java.util.Random;
import java.util.Scanner;

public class Demo7Loop {
    public static void main(String[] args) {
/*
猜数字：
1.创建对象：Scanner,Random
2.调用Random产生随机数【1,100】；
3.键盘录入Scanner;
4.比较大小，提示
5.相等则输出
 */
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        int rdNum=rand.nextInt(100)+1;
        int scNum=sc.nextInt();
//        while(scNum!=rdNum){
//            if(scNum>rdNum){
//                System.out.println("大了");
//                scNum=sc.nextInt();
//            }else if(scNum<rdNum){
//                System.out.println("小了");
//                scNum=sc.nextInt();
//            }
//        }
//        System.out.println("正确");

    int rdNum1=rand.nextInt(100)+1;     //谜底
        while(true){
            if(scNum>rdNum1){
                System.out.println("大了");
                scNum=sc.nextInt();     //重新录入
            }else if(scNum<rdNum1){
                System.out.println("小了");
                scNum=sc.nextInt();
            }else{
                System.out.println("正确");
                break;
            }
        }

    }

}
