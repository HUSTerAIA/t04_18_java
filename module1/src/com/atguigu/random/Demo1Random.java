package com.atguigu.random;

import java.util.Random;

public class Demo1Random {
    public static void main(String[] args) {
        Random rand=new Random();       // 创建对象
        int a=rand.nextInt();   // int范围内
        System.out.println("a="+a);

    }
}
