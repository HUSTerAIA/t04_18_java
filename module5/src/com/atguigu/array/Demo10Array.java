
package com.atguigu.array;


import java.util.Arrays;
import java.util.Random;

public class Demo10Array {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
      /*

       */
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

    }
}
