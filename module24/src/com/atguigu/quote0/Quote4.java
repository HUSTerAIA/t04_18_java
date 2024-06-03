package com.atguigu.quote0;

import java.util.function.Function;

/**
 * 引用数组
 * 1.重写方法apply：形参integer，返回值int[]数组
 * 2.引用方法int[]:形参integer，返回值new int[]数组
 */
public class Quote4 {
    public static void main(String[] args) {
        method(new Function<Integer, int[]>() {
            @Override
            public int[] apply(Integer integer) {
                return new int[integer];
            }
        },10);

        System.out.println("---------lambda-------------");
        method( integer->
                 new int[integer]

        ,10);

        System.out.println("----------引用数组--------------");
        /**
         * apply重写：参数Integer，返回值int[]'
         * int[] arr=new int[integer]在内部：参数类型integer,返回值int[]
         * 考虑引用方法
         */
        method(
                        int[]::new

                ,10);
    }


    /*
    类型转换，创建长度为Integer的数组int[]
     */
    public static void method(Function<Integer,int[]>function, Integer num){
        int[] arr=function.apply(num);
        System.out.println(arr.length);     //数组长度
    }
}
