package com.atguigu.thread1;

public class Thread2 extends Thread{
    public void run(){
        //获取线程名字，线程睡眠
        try {
            Thread.sleep(100L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        for(int i=1;i<10;i++){
            System.out.println(getName()+"执行了..."+i);
        }
    }

}
