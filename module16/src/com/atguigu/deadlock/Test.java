package com.atguigu.deadlock;

public class Test {
    public static void main(String[] args) {
        Runnable r1=new Runnable1(true);
        Runnable r2=new Runnable1(false);

        new Thread(r1).start();
        Thread t=new Thread(r2);
        t.start();
        t.yield();
    }
}
