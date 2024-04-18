package com.aiguigu.object;

import java.util.Arrays;

public class Demo1Object {
    public static void main(String[] args) {
        /*
        面向过程：
         */
        int[] arr = {1, 2, 3, 4};
        System.out.println("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.println(arr[i] + "]");
            } else {
                System.out.print(arr[i] + ",");

            }


        }
        System.out.println("======================");
            /*
            面向对象
             */
        System.out.println(Arrays.toString(arr));
    }
}
