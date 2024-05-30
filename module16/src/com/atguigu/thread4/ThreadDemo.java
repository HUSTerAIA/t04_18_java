package com.atguigu.thread4;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t1.setName("线程1");
        t2.setName("线程2");


        t1.start();
//        t2.start();


        //插队
        t1.join();      // 非静态成员

        for (int i = 1; i < 50; i++) {
            System.out.println(Thread.currentThread().getName() + "执行..." + i);
        }


    }
}
