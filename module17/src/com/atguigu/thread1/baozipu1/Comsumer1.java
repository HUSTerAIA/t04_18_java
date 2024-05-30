package com.atguigu.thread1.baozipu1;

public class Comsumer1 implements Runnable {
    /*
    消费包子；
    和生产相反
     */
//    BaoZiPu1 baozipu = new BaoZiPu1();
    private BaoZiPu1 baozipu;       // 私有锁对象

    public Comsumer1(BaoZiPu1 baozipu) {        // 有参构造
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
                //无包子
                if (baozipu.isFlag() == false) {
                    try {
                        baozipu.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                //有包子：消费包子
                baozipu.getCount();
                baozipu.setFlag(false);
                //唤醒生产包子
                baozipu.notify();
            }


        }

    }


}
