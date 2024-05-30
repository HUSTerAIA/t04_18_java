package com.atguigu.thread1.baozipu1;

public class Productor1 implements Runnable {       // 1.实现runnable
    /*
    生产包子
    1.判断是否有包子
    2.有包子：线程等待
    3.无包子：开始生产包子，释放锁之后唤醒消费包子
     */
//    BaoZiPu1 baozipu = new BaoZiPu1();

    private BaoZiPu1 baozipu;       // 锁对象

    public Productor1(BaoZiPu1 baozipu) {
        this.baozipu = baozipu;
    }

    //2.重写run()
    public void run() {
        while (true) {
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {      // 3.处理异常
                throw new RuntimeException(e);
            }
            synchronized (baozipu) {        // 4.同步代码块
                //有包子
                if (baozipu.isFlag() == true) {     //a.判断是否有包子
                    try {
                        baozipu.wait();             // b.有包子停止生产
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                }
                //无包子：生产包子
                baozipu.setCount();             // c.没有包子继续生产，同时设置flag
                baozipu.setFlag(true);
                //唤醒消费包子
                baozipu.notify();           // d.唤醒消费进程
            }
        }

    }

}
