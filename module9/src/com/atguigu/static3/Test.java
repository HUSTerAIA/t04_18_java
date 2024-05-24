package com.atguigu.static3;

public class Test {
    public static void main(String[] args) {
        int[] arr={1,4,6,2,7};
        int max=ArraysUtils.getMax(arr);        // 访问静态方法，直接调用
        System.out.println("max = " + max);
    }


}
