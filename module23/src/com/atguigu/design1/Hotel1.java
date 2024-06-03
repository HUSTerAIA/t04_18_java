package com.atguigu.design1;

/**
 * 模板模式
 */
public abstract class Hotel1 {      // 抽象类
    /**
     * 饭店抽象类
     */
    public void hotel(){
        System.out.println("点菜");
        eat();
        System.out.println("结账");
    }

    //不确定的方法
    public abstract void eat();     // 抽象方法

}
