
package com.atguigu.array;


import java.util.Arrays;
import java.util.Random;

public class Demo10Array {
    /**
     *二维数组
     * @param args
     */
    public static void main(String[] args) {
      /*

       */
//        int[][] arr=new int [][];   //最高维度-1之前都要初始化
        int[][] arr = new int[10][];
        System.out.println("arr = " + arr);
        int[][] arr1=new int[10][10]; //初始化
        Random rand=new Random();
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                arr1[i][j]=rand.nextInt(100);
            }
        }
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                System.out.println("arr1[i][j] = " + arr1[i][j]);
            }
        }

        int[][] arr2={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println("arr2 = " + Arrays.toString(arr2));
        for(int i=0;i<arr2.length;i++){
            System.out.println("arr2[i] = " + Arrays.toString(arr2[i]));
        }


    }
}
