package com.atguigu.thread4;

public class Thread1 extends Thread{
    public void run(){
        for(int i=1;i<50;i++){
            System.out.println(Thread.currentThread().getName()+"执行"+i);
        }
    }
}
