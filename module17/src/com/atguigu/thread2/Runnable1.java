package com.atguigu.thread2;

public class Runnable1 implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"执行线程run");
    }
}
