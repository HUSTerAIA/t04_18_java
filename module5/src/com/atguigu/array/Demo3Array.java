package com.atguigu.array;

import java.util.Arrays;
import java.util.Random;


public class Demo3Array {
    public static void main(String[] args) {
        int[] array1=new int[3];
        Random rand=new Random();
        for(int i=0;i<array1.length;i++){
            array1[i]=rand.nextInt();
        }
        System.out.println("array1 = " + Arrays.toString(array1));
    }
}
