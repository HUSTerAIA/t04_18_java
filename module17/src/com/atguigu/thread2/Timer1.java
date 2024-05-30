package com.atguigu.thread2;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 从new date开始计时每隔3000ms执行一次run
 */
public class Timer1 {
    public static void main(String[] args) {
        /*
        计时器
         */
        Timer t=new Timer();
        t.schedule(new TimerTask() {        // 匿名timertask对象
            @Override
            public void run() {
                System.out.println("计时");
            }
        },new Date(),3000L);



        TimerTask tt=new TimerTask() {      // 有名内部类
            public void run() {
                System.out.println("新任务");
            }
        };
        t.schedule(tt,new Date(),3000L);


        TimerTask0 ttt=new TimerTask0();
        t.schedule(ttt,new Date(),3000L);
    }
}
