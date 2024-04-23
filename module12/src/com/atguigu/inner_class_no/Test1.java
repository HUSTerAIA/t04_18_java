package com.atguigu.inner_class_no;

public class Test1 {
    public static void main(String[] args) {
        //匿名内部类作为返回值
        USB usb=method();
        usb.open();
    }

    public static USB method(){
        return new USB(){
            //重写
            @Override
            public void open() {
                System.out.println("打开USB");
            }
        };
    }
}
