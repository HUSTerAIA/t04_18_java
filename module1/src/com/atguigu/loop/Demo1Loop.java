package com.atguigu.loop;

public class Demo1Loop {
    public static void main(String[] args) {
        int i=0;
        for( i=1;i<=5;i++){
            System.out.println(i);
        }
        System.out.println("i="+i);
        while(i<10){
            System.out.println(i);
            i++;
        }
    }

}
