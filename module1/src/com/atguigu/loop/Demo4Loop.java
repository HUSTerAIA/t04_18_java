package com.atguigu.loop;

public class Demo4Loop {
    public static void main(String[] args) {
        /*
        1.定义山峰高度；
        2.定义纸张厚度；
        3.定义折纸次数；
        4.while循环（paper<mountain){
        对折
        }
         */
        double paper=0.1;
        int count=0;
        double mountain=8844430.24;
        while(paper<mountain){
            paper*=2;
            count++;
        }
        System.out.println("count = " + count);
    }

}
