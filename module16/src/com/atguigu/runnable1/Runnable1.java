package com.atguigu.runnable1;

public class Runnable1 implements Runnable{     // 实现接口
    //实现接口，重写run方法
    public void run(){
        for(int i=1;i<10;i++){
            System.out.println(Thread.currentThread().getName()+"执行"+i);
        }
    }
}
