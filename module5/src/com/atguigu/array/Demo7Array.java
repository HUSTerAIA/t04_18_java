
package com.atguigu.array;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Demo7Array {
    public static void main(String[] args) {
      /*
      查找元素出现位置：
      1.创建Scanner对象
      2.数组存数据
      3.遍历，判断是否相等
       */
        Scanner sc = new Scanner(System.in);
        Random rand=new Random();
        int[] arr=new int[10];
//        int temp=0;
        for (int i=0;i<arr.length;i++){
            arr[i]=rand.nextInt(10);        //初始化长度为10的数组元素
        }
        System.out.println(" 数组元素如下： ");
        System.out.println(Arrays.toString(arr));
        for(int k=0;k<arr.length;k++){
            System.out.print( arr[k]+",");
        }
        System.out.println();
        System.out.println("请选择元素：");
        int temp=sc.nextInt();
        int flag=0;
        for (int j=0;j<arr.length;j++){
            if(temp==arr[j]){
                System.out.println("元素位置 = " + j);
                flag++;
            }
        }
        if(flag==0){
            System.out.println("无此数据");
        }
    }
}
