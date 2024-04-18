package com.atguigu.recursion;

import java.util.Arrays;

public class Demo4Recursion {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int min=0;
        int max=arr.length-1;
        arr=method(min,max,arr);
        System.out.println("arr = " + Arrays.toString(arr));
    }
    public static int[] method(int min,int max,int[] arr){
        /*
        数组反转
         */
       int temp=arr[min];
       arr[min]=arr[max];
       arr[max]=temp;
       min++;
       max--;
       if(min>=max){
           return arr;
       }else{
           return method(min,max,arr);
       }

    }
}
