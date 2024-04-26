package com.atguigu.utils1;

import java.sql.Array;

public class System1 {
    public static void main(String[] args) {
        //获取当前时间
        long time1=System.currentTimeMillis();
        System.out.println("time1 = " + time1);
        //退出
//        System.exit(1);

        //复制数组
        int[] arr1={1,2,3,4,5};
        int[] arr2=new int[10];
        System.arraycopy(arr1,0,arr2,4,3);
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
    }
}
