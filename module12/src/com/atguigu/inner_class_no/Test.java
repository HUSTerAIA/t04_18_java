package com.atguigu.inner_class_no;

public class Test {
    public static void main(String[] args) {
        //匿名对象作为方法参数
        method(new USB() {
            //重写接口方法
            @Override
            public void open() {
                System.out.println("打开USB");
            }
        });


    }

    public static void method(USB usb) {
        usb.open();
    }
}
