package com.atguigu.array;


import java.sql.Array;

public class Demo5Array {
    public static void main(String[] args) {
        int[] arr={1,4,76,3,8,39};
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){     // 查找最大值
                max=arr[i];
            }
        }
        System.out.println("max = " + max);
    }
}
