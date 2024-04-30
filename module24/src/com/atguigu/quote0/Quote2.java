package com.atguigu.quote0;

import java.util.function.Supplier;

public class Quote2 {
    public static void main(String[] args) {
        //随机数
        method(new Supplier<Double>() {
            @Override
            public Double get() {
                return Math.random();
            }
        });

        System.out.println("------lambda----------");
        method(() ->
                 Math.random()

        );

        /*
        get:无参，返回值double
        random:无参，返回值double
         */

        System.out.println("-------引用方法-----------");
        method(
                Math::random

        );


    }
    public static void method(Supplier<Double>supp){
        Double num=supp.get();
        System.out.println(num);

    }
}
