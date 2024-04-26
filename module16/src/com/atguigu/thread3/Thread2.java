package com.atguigu.thread3;

public class Thread2 extends Thread{
    public void run(){
        for(int i=1;i<50;i++){
            //礼让线程
            Thread.yield();
            System.out.println(Thread.currentThread().getName()+"执行..."+i);

        }
    }
}
