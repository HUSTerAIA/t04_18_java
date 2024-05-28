package com.atguigu.inner_class_no;

public class Test {
    public static void main(String[] args) {
        //匿名内部类作为方法参数
        method(new USB() {      // 实现类，创建接口的实现类对象
            //重写接口方法
            @Override
            public void open() {
                System.out.println("打开USB");
            }       // USB usb=new USB(){}
        });     // method调用open（）重写方法


    }

    public static void method(USB usb) {
        usb.open();
    }
}
