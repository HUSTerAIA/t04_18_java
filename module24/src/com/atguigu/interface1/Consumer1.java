package com.atguigu.interface1;

import sun.management.snmp.jvminstr.JvmOSImpl;

import java.util.function.Consumer;

public class Consumer1 {
    public static void main(String[] args) {
        //获取字符串长度
        method(new Consumer<String>() {     // 1.调用方法，传递参数

                   public void accept(String str) {     // 3.重写方法
                       System.out.println(str.length());
                   }
               }, "edhsewe");

        System.out.println("--------lambda--------------");
        method(( str)-> {       // 重写方法参数类型省略
                System.out.println(str.length());       // 重写方法体只有一句话

        }, "edhsewe");

    }

    public static void method(Consumer<String> cons, String s) {
        //consumer
        cons.accept(s);     // 2.调用重写方法
    }
}
