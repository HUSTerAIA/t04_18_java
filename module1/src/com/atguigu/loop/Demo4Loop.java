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
        double paper=0.1;       //纸张厚度
        int count=0;            //折纸次数
        double mountain=8844430.24;         //山峰高度
        while(paper<mountain){      //纸张高度《山峰
            paper*=2;       //对折
            count++;       //次数+1
        }
        System.out.println("count = " + count);
    }

}
