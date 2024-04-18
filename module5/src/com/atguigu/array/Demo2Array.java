package com.atguigu.array;

import java.util.Arrays;
import java.util.Scanner;

public class Demo2Array {
    public static void main(String[] args) {
        int[] array1=new int[3];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<array1.length;i++){
            array1[i]=sc.nextInt();
        }
        System.out.println("array1 = " + Arrays.toString(array1));
    }
}
