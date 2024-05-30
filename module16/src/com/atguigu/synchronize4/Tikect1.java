package com.atguigu.synchronize4;


public class Tikect1 implements Runnable {
    /*
    售票
     */
    static int tikects = 30;

    //静态方法
    public synchronized static  void method() {

        System.out.println(Thread.currentThread().getName() + "买票" + tikects--);
    }

    public static void method2() {
        synchronized (Tikect1.class) {      // 默认锁：类名.class对象
            System.out.println("this = " + Tikect1.class);
            System.out.println(Thread.currentThread().getName() + "买票" + tikects--);
        }

    }

    //重写，同步块，
    public void run() {

        while (tikects > 0) {
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            method();
//            method2();
        }
    }
}

