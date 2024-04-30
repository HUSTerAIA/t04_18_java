package com.atguigu.interface1;

import java.util.Arrays;
import java.util.function.Supplier;

public class Test2 {
    public static void main(String[] args) {
        //supplier
        method(new Supplier<Integer>() {
            //重写
            @Override
            public Integer get() {
                int[] arr = {3, 54, 23, 6, 4, 4, 9};
                Arrays.sort(arr);
                return arr[arr.length - 1];
            }
        });
        System.out.println("-----------lambda--------------");
        method( () ->{
                int[] arr = {3, 54, 23, 6, 4, 4, 9};
                Arrays.sort(arr);
                return arr[arr.length - 1];

        });

    }

    /**
     * 求最大值
     */

    public static void method(Supplier<Integer> supp) {
        Integer max = supp.get();
        System.out.println("max = " + max);
    }
}
