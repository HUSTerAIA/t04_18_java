package com.atguigu.synchronize1;

public class Tikect1 implements Runnable {      // 1.实现runnable
    /*
    售票
     */
    int tikects = 100;
    //加锁
    Object lock = new Object();         // 1.创建锁对象，object基类

    //重写，同步块，
    public void run() {     // 2.重写run方法

            while (tikects > 0) {
                try {       // run方法处理异常
                    Thread.sleep(100L);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (lock) {       // 3.同步代码块，买票结束之后tikect-1，释放锁
                System.out.println(Thread.currentThread().getName() + "买票" + tikects--);
            }
        }
    }
}
