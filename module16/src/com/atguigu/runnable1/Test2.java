package com.atguigu.runnable1;


public class Test2 {
    public static void main(String[] args) {
        //匿名
        new Thread(new Runnable(){      // 匿名对象
            //重写
            public void run(){          // 重写run
                for(int i=0;i<10;i++){
                    System.out.println(Thread.currentThread().getName()+"执行"+i);
                }

            }

        },"线程1").start();       // 设置名字，start开启线程

    }
}
