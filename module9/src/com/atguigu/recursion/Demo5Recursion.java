package com.atguigu.recursion;

import java.util.Arrays;

public class Demo5Recursion {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        for(int min=0, max=arr.length-1;min<max;min++,max--){
            int temp=arr[min];
            arr[min]=arr[max];
            arr[max]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
