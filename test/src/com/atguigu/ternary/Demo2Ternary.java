package com.atguigu.ternary;

public class Demo2Ternary {
    public static void main(String[] args) {
        int score=90;
        int score2=93;
        int score3=94;
        int temp=(score>score2?score:score2);
        int max=temp>score3?temp:score3;
        System.out.println("max="+max);
    }
}

