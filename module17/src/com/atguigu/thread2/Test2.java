package com.atguigu.thread2;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        method2();
    }
    public static void method2() throws ExecutionException, InterruptedException {
        ExecutorService es= Executors.newFixedThreadPool(2);
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
