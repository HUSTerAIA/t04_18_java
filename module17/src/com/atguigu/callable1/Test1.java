package com.atguigu.callable1;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 1.创建callable实现类对象
 * 2.创建futuretask对象
 * 3.创建多线程对象
 * 4.start
 */
public class Test1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        /*
        实现多线程
         */
        Callable1 c1=new Callable1();   //创建实现类对象，默认object类型返回

//        FutureTask(Callable<V> callable)
//        创建一个 FutureTask ，它将在运行时执行给定的 Callable 。
        FutureTask<String> f1=new FutureTask<>(c1);     // 后面一个泛型<>没有指定，根据等号前面自动推断string
        //创建多线程
        Thread t1=new Thread(f1);
        t1.start(); //开启线程

        //获取call方法返回值
        System.out.println(f1.get());

    }
}
