package com.atguigu.thread2;

public class Thread2 extends Thread{
    public void run(){
        for(int i=1;i<5;i++){
            System.out.println(getName()+"执行..."+i);
        }
    }
}
