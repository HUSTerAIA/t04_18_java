package com.atguigu.runnable1;

public class Test1 {
    public static void main(String[] args) {
        //创建实现类对象
        Runnable1 r1=new Runnable1();       // 创建runnable实现类对象
        //创建线程对象
        Thread t1=new Thread(r1);           // 创建thread对象
        //开启线程
        t1.start();

        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
}
