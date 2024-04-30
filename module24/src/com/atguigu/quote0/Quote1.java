package com.atguigu.quote0;

import java.util.function.Supplier;

public class Quote1 {
    public static void main(String[] args) {
        //引用成员方法
        method(new Supplier<String>() {
            @Override
            public String get() {
                return "  abc".trim();      //去除开头空格
            }
        });

        /*
        1.get为重写的方法，参数为空，返回值string;
        2.trim()在get()里面，参数为空，返回值string；
        考虑使用方法引用
         */


        method(
                 "  abc"::trim    //去除开头空格

        );
    }

    public static void method(Supplier<String> supp) {
        String s=supp.get();
        System.out.println("s="+s);
    }
}
