package com.atguigu.interface1;

public class Mouse implements USB{
    public void open(){
        System.out.println("打开鼠标");

    }

    @Override
    public String close(String msg){
        return msg;
    }

    public void method1(){
        System.out.println("重写接口默认方法");
    }
}
