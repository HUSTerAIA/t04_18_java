package com.atguigu.synchronize1;

public class Tikect1 implements Runnable {
    /*
    售票
     */
    int tikects = 100;
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
                synchronized (lock) {
                System.out.println(Thread.currentThread().getName() + "买票" + tikects--);
            }
        }
    }
}
