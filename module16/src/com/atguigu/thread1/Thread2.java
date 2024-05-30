package com.atguigu.thread1;

public class Thread2 extends Thread{
    public void run(){      // run方法不能上抛异常
        //获取线程名字，线程睡眠
        try {
            Thread.sleep(100L);
        } catch (InterruptedException e) {      // 处理异常
            throw new RuntimeException(e);      // 自己创建异常
        }

        for(int i=1;i<10;i++){
            System.out.println(this.getName()+"执行了..."+i);
        }
    }

}
