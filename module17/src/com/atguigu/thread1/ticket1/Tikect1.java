package com.atguigu.thread1.ticket1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Tikect1 implements Runnable {
    /*
    售票
     */
    int tikects = 30;
    //加锁
//    Object lock = new Object();
    Lock lock1 = new ReentrantLock();
    //重写，同步块，
    public void run() {


        while (tikects > 0) {
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            lock1.lock();        //加锁
            System.out.println(Thread.currentThread().getName() + "买票" + tikects);
            tikects--;
            lock1.unlock();     //解锁

        }
    }
}
