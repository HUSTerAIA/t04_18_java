package com.atguigu.thread2;

import java.util.concurrent.Callable;

public class Callable1 implements Callable<String> {
    @Override
    public String call(){
//        String str=Thread.currentThread().getName()+"执行线程call";
        return Thread.currentThread().getName()+"执行线程call";
    }
}
