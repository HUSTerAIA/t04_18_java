package com.atguigu.loop;

public class Demo2Loop {
    public static void main(String[] args) {
        /**
         * 100内偶数求和
         */
        int sum=0;
        for(int i=1;i<=100;i++){
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.println("sum = " + sum);

    }

}
