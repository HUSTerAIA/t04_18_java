package com.atguigu.thread1.baozipu2;

public class BaoZiPu1 {
    /*
    包子铺类,标准javabean
     */
    /*
    成员属性也可以定义为包装类，但是必须初始化赋值防止空指针
     */
    //包子计数
    private int count;
    //判断是否有包子
    private boolean flag;

    //构造
    public BaoZiPu1() {
    }

    public BaoZiPu1(int count, boolean flag) {
        this.count = count;
        this.flag = flag;
    }

    //getset方法

    //改造为消费包子,同步方法
    public synchronized void getCount() {
        //无包子
        if (this.flag == false) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        //有包子：消费包子
        System.out.println("消费包子" + count);
        this.setFlag(false);
        //唤醒生产包子
        this.notify();

    }

    //改造为生产包子,同步方法
    public synchronized void setCount() {
        //有包子
        if (this.flag == true) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        //无包子：生产包子
        count++;
        System.out.println("生产包子" + count);
        this.flag = true;
        //唤醒消费包子
        this.notify();
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
