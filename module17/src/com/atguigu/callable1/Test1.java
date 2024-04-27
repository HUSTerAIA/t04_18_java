package com.atguigu.callable1;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Test1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        /*
        实现多线程
         */
        Callable1 c1=new Callable1();   //创建实现类对象

//        FutureTask(Callable<V> callable)
//        创建一个 FutureTask ，它将在运行时执行给定的 Callable 。
        FutureTask<String> f1=new FutureTask<>(c1);
        //创建多线程
        Thread t1=new Thread(f1);
        t1.start(); //开启线程

        //获取call方法返回值
        System.out.println(f1.get());

    }
}
