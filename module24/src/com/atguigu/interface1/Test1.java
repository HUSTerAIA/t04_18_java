package com.atguigu.interface1;

// lambda表达式
public class Test1 {
    public static void main(String[] args) {

        method(new USB() {      // 1.调用方法，传递采纳数
            public void open(String s) {        // 3.重写方法
                System.out.println(s+"打开");
            }
        });

        System.out.println("-----------lambda--------------");
        method((String s) -> {
            System.out.println(s+"打开");
        });
        System.out.println("-----------lambda简化--------------");
        method( s ->        // 重写方法只有一个形参
                System.out.println(s+"打开")      // 重写方法体只有一句话
        );


    }

    public static void method(USB usb) {
        usb.open("鼠标");         // 2.调用重写方法
    }
}
