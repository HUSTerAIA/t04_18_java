package com.atguigu.array;

import java.util.Arrays;
import java.util.Random;


public class Demo4Array {
    public static void main(String[] args) {
        int[] array1=new int[3];
        array1[0]=10;
        array1[1]=20;
        array1[2]=30;
        for(int i=0;i<array1.length;i++){
            System.out.println(array1[i]);
        }
        int[] array2=new int[3];
        System.out.println(array2);     //地址值
        System.out.println(array2[0]);  // int默认值
    }
}
