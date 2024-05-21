
package com.atguigu.array;


import java.util.Arrays;

public class Demo9Array {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
      /*
        数组合并：
        1.创建新数组；
        2.新数组依次复制两个旧数组
       */
        int[] oldArray1 = {1,2,5,3,7};
        int[] oldArray2 = {3,7,5,2,7,9};
        int[] newArray=new int[oldArray1.length+oldArray2.length];

        for (int i=0;i<oldArray1.length;i++){
            newArray[i]=oldArray1[i];
        }
        for(int j=0;j<oldArray2.length;j++){
            newArray[j+oldArray1.length]=oldArray2[j];      //第二次赋值首位在第一次赋值末尾
        }
        System.out.println("newArray:"+ Arrays.toString(newArray));

    }
}
