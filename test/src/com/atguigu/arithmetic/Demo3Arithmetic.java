package com.atguigu.arithmetic;

public class Demo3Arithmetic {
    public static void main(String[] args) {
        int i = 8;
        i++;
        System.out.println(i);
        System.out.println("================");

        int j=8;
        ++j;
        System.out.println(j);
        System.out.println("===============");

        int k=8;
        int result=k++;
        System.out.println(result);
        System.out.println(k);

        int num1=10;
        int num2=20;
        int result1=num1++ + --num2 + ++num1;
        /*
        10+19=29;
        num1->10+ 1 = 11;
        29+12=41;
         */
        System.out.println(result1);


    }
}
