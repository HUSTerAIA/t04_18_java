package com.atguigu.switch1;

import java.util.Scanner;

public class Demo4Switch {
    public static void main(String[] args) {
        System.out.print("输入一个整数：");
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        String str=switch(num){
            case 3,4,5 ->"春季";
            case 6,7,8 ->"夏季";
            case 9,10,11 ->"秋季";
            case 12,1,2 ->"冬季";
            default -> "无效";
        };
        System.out.println(str);

    }
}
