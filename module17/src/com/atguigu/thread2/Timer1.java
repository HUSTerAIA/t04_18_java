package com.atguigu.thread2;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Timer1 {
    public static void main(String[] args) {
        /*
        计时器
         */
        Timer t=new Timer();
        t.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("计时");
            }
        },new Date(),3000L);

    }
}
