package com.atguigu.recursion;

import java.util.Arrays;

/**
 * 二分查找元素位置
 */
public class Demo7Recursion {
    public static void main(String[] args) {
        int[] arr={1,3,4,6,7,9};
        int index=binarySearch(arr,4);
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
             if(target>arr[mid]){   // 元素大于中位数
                 min=mid+1;     // 区间缩小为后半部分
             }else if(target<arr[mid]){     // 元素小于中位数
                 max=mid-1;     // 区间缩小为前半部分
             }else {
                 return mid;        // 元素==中位数
             }


         }
         return -1; //查询不到
     }

}
