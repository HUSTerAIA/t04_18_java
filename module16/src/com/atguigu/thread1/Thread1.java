package com.atguigu.thread1;

public class Thread1 extends Thread{
    public void run(){
        for(int i=1;i<5;i++){
            System.out.println("多线程执行"+i);
        }
    }
}
