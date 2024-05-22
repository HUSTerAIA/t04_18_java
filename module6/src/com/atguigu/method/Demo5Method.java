package com.atguigu.method;

import java.util.Scanner;

public class Demo5Method {
    public static void main(String[] args) {
        int[] result=method(4,87);
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }

    }
    /**
     * 求两数之和、之差
     * 参数：
     * 返回值：int[],整数数组
     */
    public static int[] method(int a,int b) {
        int sum=a+b;
        int sub=a-b;
        int[] result={sum,sub};
        System.out.println("result[1] = " + result[1]);
        return result;

    }

}
