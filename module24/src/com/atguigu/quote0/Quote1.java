package com.atguigu.quote0;

import java.util.function.Supplier;

/**
 * 引用成员方法
 */
public class Quote1 {
    public static void main(String[] args) {
        //引用成员方法
        method(new Supplier<String>() {     // 1.调用方法，传递参数
            @Override
            public String get() {       // 3.重写方法
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
        String s=supp.get();        // 2.调用重写方法
        System.out.println("s="+s);
    }
}
