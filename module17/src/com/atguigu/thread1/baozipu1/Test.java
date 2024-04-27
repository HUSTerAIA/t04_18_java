package com.atguigu.thread1.baozipu1;

public class Test {
    public static void main(String[] args) {
        //确保同一把锁,创建类
        BaoZiPu1 baozipu=new BaoZiPu1();

        //创建线程实现类
        Productor1 p=new Productor1(baozipu);
        Comsumer1 c=new Comsumer1(baozipu);

        //创建线程
        Thread t1=new Thread(p);
        Thread t2=new Thread(c);

        t1.start();
        t2.start();
    }
}
