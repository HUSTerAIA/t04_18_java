package com.atguigu.thread2;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        /*
        实现多线程
        1.创建线程池对象
        2.创建run()对象  ------   创建call对象，接收call返回值
        3.关闭线程池
         */
        method1();
/*        System.out.println("=============");
        method2();*/
    }

    public static void method1() {
        ExecutorService es = Executors.newFixedThreadPool(2);
        Runnable r1 = new Runnable1();
        Runnable r2 = new Runnable1();

        es.execute(r1);
        es.execute(r2);
        es.execute(new Runnable1());
        es.execute(new Runnable1());

        es.shutdown();

    }

    public static void method2() throws ExecutionException, InterruptedException {
        ExecutorService es=Executors.newFixedThreadPool(2);
        Callable1 c1=new Callable1();
        Callable1 c2=new Callable1();
        Callable1 c3=new Callable1();
        Callable1 c4=new Callable1();

        Future<String> f1=es.submit(c1);
        Future<String> f2=es.submit(c2);
        Future<String> f3=es.submit(c3);
        Future<String> f4=es.submit(c4);

        System.out.println(f1.get());
        System.out.println(f2.get());
        System.out.println(f3.get());
        System.out.println(f4.get());

        es.shutdown();
    }

}
