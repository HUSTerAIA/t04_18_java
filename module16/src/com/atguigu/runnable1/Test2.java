package com.atguigu.runnable1;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Test2 {
    public static void main(String[] args) {
        //匿名
        new Thread(new Runnable(){
            //重写
            public void run(){
                for(int i=0;i<10;i++){
                    System.out.println(Thread.currentThread().getName()+"执行"+i);
                }

            }

        },"线程1").start();
    }
}
