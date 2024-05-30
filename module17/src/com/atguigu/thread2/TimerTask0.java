package com.atguigu.thread2;

import java.util.TimerTask;

public class TimerTask0 extends TimerTask {     // 继承抽象类
    @Override
    public void run() {         // 重写抽象方法
        System.out.println("新新任务");
    }
}
