package com.atguigu.thread1.baozipu1;

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

    //改造为消费包子
    public void getCount() {
        System.out.println("消费包子" + count);

    }

    //改造为生产包子
    public void setCount() {
        count++;
        System.out.println("生产包子" + count);
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
