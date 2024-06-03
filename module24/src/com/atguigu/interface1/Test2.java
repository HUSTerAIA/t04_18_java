package com.atguigu.interface1;

import java.util.Arrays;
import java.util.function.Supplier;

/**
 * supplier接口
 */
public class Test2 {
    public static void main(String[] args) {
        //supplier
        method(new Supplier<Integer>() {        // 1.调用方法，传递参数
            //重写
            @Override
            public Integer get() {      // 3.重写方法
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
        Integer max = supp.get();       // 2.调用重写方法
        System.out.println("max = " + max);
    }
}
