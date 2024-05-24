package com.atguigu.recursion;

import java.util.Arrays;

/**
 * 冒泡法
 */
public class Demo6Recursion {
    public static void main(String[] args) {
        /*
        冒泡排序
         */
        int[] arr = {5, 4, 3, 2, 1};

        /*
        第一圈，依次近邻比较，最大值冒泡
         */
        for (int i = 0; i < arr.length - 1 - 0; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        /*
        第二圈，同第一圈，除了最大值其余比较，次最大值冒泡
         */
        for (int i = 0; i < arr.length - 1 - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        //...
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

        for (int j = 0; j < arr.length - 1; j++) {    //比较次数
            for (int i = 0; i < arr.length - 1 - j; i++) {      //每一轮最大值冒泡
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
    }
}
