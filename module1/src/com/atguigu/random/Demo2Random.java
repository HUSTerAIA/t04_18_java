package com.atguigu.random;

import java.util.Random;

public class Demo2Random {
    public static void main(String[] args) {
        Random rand=new Random();
        int a=rand.nextInt(100);    //[0,100)
        System.out.println("a="+a);

        //234-1243
        int b=rand.nextInt(1243+1-234)+234;
        System.out.println("b="+b);

    }
}
