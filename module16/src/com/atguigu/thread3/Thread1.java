package com.atguigu.thread3;

public class Thread1 extends Thread{
    public void run(){
        for(int i=1;i<50;i++){
            System.out.println(this.getName()+"执行"+i);
        }
    }
}
