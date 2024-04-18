package com.atguigu.method;

public class Demo2Method {
    public static void main(String[] args) {

        int sum0=sum0(3,6);
        System.out.println("sum0 = " + sum0);
        sum(3,6);
        int sum1=sum1(3,6);
        System.out.println("sum1 = " + sum1);
//        System.out.println("sum1(3,6) = " + sum1(3, 6));  //不推荐
    }
    public static int sum0(int a,int b){
        return a+b;
    }

    public static void sum(int a, int b){
        int sum=a+b;
        System.out.println("sum="+sum);
    }

    public static int sum1(int a, int b){
        int sum1=a+b;
        return sum1;
    }

}
