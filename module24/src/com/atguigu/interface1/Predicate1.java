package com.atguigu.interface1;

import java.util.function.Predicate;

public class Predicate1 {
    public static void main(String[] args) {
        //判断
        method(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length()==1;
            }
        },"shfj");

        System.out.println("-------lambda-----------");
        method(( s) ->
                 s.length()==1

        ,"shfj");

    }
    public static void method(Predicate<String> predicate, String s){
        //predicate
        boolean result=predicate.test(s);
        System.out.println(result);
    }
}
