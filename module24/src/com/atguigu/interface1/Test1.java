package com.atguigu.interface1;

public class Test1 {
    public static void main(String[] args) {

        method(new USB() {
            public void open(String s) {
                System.out.println(s+"打开");
            }
        });

        System.out.println("-----------lambda--------------");
        method((String s) -> {
            System.out.println(s+"打开");
        });
        System.out.println("-----------lambda简化--------------");
        method( s ->
                System.out.println(s+"打开")
        );


    }

    public static void method(USB usb) {
        usb.open("鼠标");
    }
}
