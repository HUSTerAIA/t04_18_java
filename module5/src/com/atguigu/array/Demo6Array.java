
package com.atguigu.array;


import java.util.Random;

public class Demo6Array {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr=new int[10];
        int count=0;
        for(int i=0;i<10;i++){
            arr[i]=rand.nextInt(100)+1;
        }
        for(int j=0;j<10;j++){
            if(arr[j]%3==0 && arr[j]%5==0 && arr[j]%7!=0)
            {
                count++;
                System.out.println("arr[j] = " + arr[j]);
            }

        }
        System.out.println("count = " + count);
    }
}
