package com.atguigu.exam;

public class Mouse implements USB{
    /**
     * 接口实现
     */

    @Override
    public void open(){
        System.out.println("鼠标开启");

    }

    @Override
    public void close() {
        System.out.println("鼠标关闭");
    }

    //特有方法
    public void method(){
        System.out.println("鼠标点击");
    }
}
