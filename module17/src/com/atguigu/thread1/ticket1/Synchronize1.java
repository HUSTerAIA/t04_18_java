package com.atguigu.thread1.ticket1;

public class Synchronize1 {
    public static void main(String[] args) {
        //创建实现类
        Tikect1 t=new Tikect1();
        //创建线程类
        Thread t1=new Thread(t,"张三");
        Thread t2=new Thread(t,"李四");
        Thread t3=new Thread(t,"王五");

        t1.start();
        t2.start();
        t3.start();
    }
}
