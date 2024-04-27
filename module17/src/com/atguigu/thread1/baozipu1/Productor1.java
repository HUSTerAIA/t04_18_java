package com.atguigu.thread1.baozipu1;

public class Productor1 implements Runnable {
    /*
    生产包子
    1.判断是否有包子
    2.有包子：线程等待
    3.无包子：开始生产包子，释放锁之后唤醒消费包子
     */
//    BaoZiPu1 baozipu = new BaoZiPu1();

    private BaoZiPu1 baozipu;

    public Productor1(BaoZiPu1 baozipu) {
        this.baozipu = baozipu;
    }

    //重写run()
    public void run() {
        while (true) {
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (baozipu) {
                //有包子
                if (baozipu.isFlag() == true) {
                    try {
                        baozipu.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                }
                //无包子：生产包子
                baozipu.setCount();
                baozipu.setFlag(true);
                //唤醒消费包子
                baozipu.notify();
            }
        }

    }

}
