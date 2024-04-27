package com.atguigu.thread1.baozipu2;

public class Comsumer1 implements Runnable {
    /*
    消费包子；
    和生产相反
     */
//    BaoZiPu1 baozipu = new BaoZiPu1();
    private BaoZiPu1 baozipu;

    public Comsumer1(BaoZiPu1 baozipu) {
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
            baozipu.getCount();

        }

    }


}
