package com.atguigu.pack;

import java.util.Arrays;

public class Demo1Pack {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        /*
        Arrays:类->对象；toString:方法->调用；
        将实现toString的代码封装到方法里面，对外提供接口->toString方法名；
         */
        System.out.println(Arrays.toString(arr));
    }
}
