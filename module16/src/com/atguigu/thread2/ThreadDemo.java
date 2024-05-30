package com.atguigu.thread2;

public class ThreadDemo {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t1.setName("线程1");
        t2.setName("线程2");

//设置守护线程
        t1.setDaemon(true);     //非守护线程t2结束，告知守护线程t1结束

        t1.start();
        t2.start();

    }
}
