package com.atguigu.utils1;

import java.util.Arrays;

public class Arrays1 {
    public static void main(String[] args) {
        //格式转换
        int[] arr1={2,4,6,3,5,9};
        System.out.println(Arrays.toString(arr1));

        //数组排序
        Arrays.sort(arr1);
        System.out.println("arr1 = " + Arrays.toString(arr1));

        //二分查找
        int[] arr2={4,3,6,2,5};
        Arrays.sort(arr2);      //先升序排序
        int index=Arrays.binarySearch(arr2,3);
        System.out.println("arr2 = " + Arrays.toString(arr2));
        System.out.println("3的位置:"+index);

        //数组扩容
        int[]  arr3=Arrays.copyOf(arr2,10);
        System.out.println("arr3 = " + Arrays.toString(arr3));

        arr2=arr3;  //复制
        System.out.println("arr2 = " + Arrays.toString(arr2));
    }
}
