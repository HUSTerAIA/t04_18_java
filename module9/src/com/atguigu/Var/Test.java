package com.atguigu.Var;

public class Test {
    public static void main(String[] args) {
        sum(1,1,2,3,4);
    }

    public static void sum(int a,int...arr){
        System.out.println(a);
        int sum = 0;
        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("sum = " + sum);
    }
}
