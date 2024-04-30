package com.atguigu.interface1;

import sun.management.snmp.jvminstr.JvmOSImpl;

import java.util.function.Consumer;

public class Consumer1 {
    public static void main(String[] args) {
        //获取字符串长度
        method(new Consumer<String>() {

                   public void accept(String str) {
                       System.out.println(str.length());
                   }
               }, "edhsewe");

        System.out.println("--------lambda--------------");
        method(( str)-> {
                System.out.println(str.length());

        }, "edhsewe");

    }

    public static void method(Consumer<String> cons, String s) {
        //consumer
        cons.accept(s);
    }
}
