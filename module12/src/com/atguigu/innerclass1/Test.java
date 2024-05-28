package com.atguigu.innerclass1;

public class Test {
    public static void main(String[] args) {
        //匿名对象.调用方法
        new USB(){
            //重写方法
            public void open(){
                System.out.println("打开USB");
            }
        }.open();           // new 对象.重写方法

        //有名对象
        USB usb=new USB(){
            public void open(){
                System.out.println("usb打开");
            }
        };          // 对象名接收
        usb.open();     // 调用重写方法
    }
}
