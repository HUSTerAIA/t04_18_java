package com.atguigu.thread1.baozipu3;

/**
 *
 * 多个生产者、多个消费者
 */
public class Test {
    public static void main(String[] args) {
        /*
        1.创建runnable实现类对象
        2.创建线程对象
        3.开启线程
         */


        //确保同一把锁,创建类
        BaoZiPu1 baozipu = new BaoZiPu1();      // 只有一把锁

        //创建线程实现类
        Productor1 p = new Productor1(baozipu);
        Productor1 p1 = new Productor1(baozipu);
        Productor1 p2 = new Productor1(baozipu);

        Comsumer1 c = new Comsumer1(baozipu);
        Comsumer1 c1 = new Comsumer1(baozipu);
        Comsumer1 c2 = new Comsumer1(baozipu);

        //创建线程

        Thread t1 = new Thread(p);
        Thread t2 = new Thread(p1);
        Thread t3 = new Thread(p2);

        Thread t4 = new Thread(c);
        Thread t5 = new Thread(c1);
        Thread t6 = new Thread(c2);

        t1.start();
        t2.start();
        t3.start();

        t4.start();
        t5.start();
        t6.start();
    }
}
