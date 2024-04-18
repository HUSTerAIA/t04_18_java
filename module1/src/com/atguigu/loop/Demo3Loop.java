package com.atguigu.loop;

public class Demo3Loop {
    public static void main(String[] args) {
        int i=1;
        int sum=0;
        while(i<=5){
            sum+=i;
            i++;
        }
        System.out.println("sum="+sum);
        System.out.println("i = " + i);
    }

}
