package com.atguigu.thread1;

public class ThreadDemo2 {
    public static void main(String[] args) throws InterruptedException {
        Thread2 t2=new Thread2();

//        t2.setName("线程2");
        t2.start();
//        t2.sleep(100L);
        for(int i=1;i<6;i++){
            Thread.sleep(100L);
            System.out.println(Thread.currentThread().getName()+"线程执行"+i);   //观察抢占
        }
    }
}
