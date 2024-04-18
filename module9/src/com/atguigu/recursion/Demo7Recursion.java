package com.atguigu.recursion;

import java.util.Arrays;

public class Demo7Recursion {
    public static void main(String[] args) {
        int[] arr={1,3,4,6,7,9};
        int index=binarySearch(arr,10);
        System.out.println(index);
     }
     public static int binarySearch(int[] arr, int target) {
        /*
        二分法
         */
         int min=0;
         int max=arr.length-1;
         int mid=0;
         while(min<=max){   //min>max结束循环
             mid=(min+max)/2;
             if(target>arr[mid]){
                 min=mid+1;
             }else if(target<arr[mid]){
                 max=mid-1;
             }else {
                 return mid;
             }


         }
         return -1; //查询不到
     }

}
