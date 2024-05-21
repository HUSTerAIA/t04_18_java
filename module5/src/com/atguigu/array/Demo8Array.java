
package com.atguigu.array;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Demo8Array {
    /**数组扩容
     *
     * @param args
     */
    public static void main(String[] args) {
      /*
      1.创建新数组
      2.复制旧数组
      3.旧数组地址值指向新数组
       */
        int[] oldArray = {1,2,5,3,7};
        System.out.println("oldArray = " + oldArray);
        int[] newArray=new int[10];     // 定义新数组
        System.out.println("oldArray:"+ Arrays.toString(oldArray));
        for (int i=0;i<oldArray.length;i++){
            newArray[i]=oldArray[i];        //旧数组元素复制
        }
        oldArray=newArray;      //旧数组指向新数组地址
        System.out.println("newArray:"+ Arrays.toString(oldArray));

        System.out.println(oldArray);       //旧数组地址值改变
        System.out.println(newArray);

    }
}
