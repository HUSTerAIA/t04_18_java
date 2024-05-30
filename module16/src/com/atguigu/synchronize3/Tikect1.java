package com.atguigu.synchronize3;


public class Tikect1 implements Runnable {
    /*
    售票
     */
    int tikects = 30;
    //加锁
    Object lock = new Object();

    //重写，同步块，
    public void run() {

        while (tikects > 0) {
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
//method();
            method2();
        }
    }

    //非静态方法
    public synchronized void method() {

        System.out.println(Thread.currentThread().getName() + "买票" + tikects--);
    }

    public void method2() {
        synchronized (this) {       // 默认锁：this
            System.out.println("this = " + this);
            System.out.println(Thread.currentThread().getName() + "买票" + tikects--);
        }

    }
}

