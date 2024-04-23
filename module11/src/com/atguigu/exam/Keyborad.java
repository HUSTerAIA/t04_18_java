package com.atguigu.exam;

public class Keyborad implements USB{
    /**
     * 接口实现
     */

    @Override
    public void open(){
        System.out.println("键盘开启");

    }

    @Override
    public void close() {
        System.out.println("键盘关闭");
    }

    //特有方法
    public void method(){
        System.out.println("键盘敲击");
    }
}
