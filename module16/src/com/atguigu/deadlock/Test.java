package com.atguigu.deadlock;

public class Test {
    public static void main(String[] args) {
        Runnable r1=new Runnable1(true);        // 1.实现类对象   2.重写run   3.创建thread对象   4.start
        Runnable r2=new Runnable1(false);

        new Thread(r1).start();
        Thread t=new Thread(r2);
        t.start();
        t.yield();      // r2进程让步
    }
}
