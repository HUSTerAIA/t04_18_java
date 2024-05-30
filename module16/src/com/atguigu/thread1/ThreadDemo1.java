package com.atguigu.thread1;

public class ThreadDemo1 {
    public static void main(String[] args) {
        //多线程和主线程
        Thread1 t1=new Thread1();       // 创建线程对象
        t1.start();     //开启多线程
//        t1.run();       //仅仅是调用方法

        for(int i=1;i<6;i++){
            System.out.println("main线程执行"+i);   //观察抢占
        }
    }
}
