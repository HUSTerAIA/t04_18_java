package com.atguigu.array;

public class Demo1Array {
    public static void main(String[] args) {
        int[] array1=new int[3];        // 引用数据类型，动态初始化，指定长度

        String[] arr2 =new String[3];

        int[] arr3={1,2,3,4,5,6,};       //静态初始化，指定数组元素

        int len=arr3.length;        //属性
        System.out.println("len = " + len);

    }
}
