package com.atguigu.deadlock;

public class Runnable1 implements Runnable {
    private boolean flag;

    public Runnable1(boolean flag) {
        this.flag = flag;   //有参构造
    }

    public void run() {
        //重写
        if (flag) {         // 两个不同的锁
            synchronized (Lock1.lock1) {        // 先取锁1
                System.out.println("if lock1");
                synchronized (Lock2.lock2) {        // 后取锁2
                    System.out.println("if lock2");
                }
            }
        } else {
            synchronized (Lock2.lock2) {        // 相反
                System.out.println("else lock2");
                synchronized (Lock1.lock1) {
                    System.out.println("else lock1");
                }
            }
        }

    }
}
