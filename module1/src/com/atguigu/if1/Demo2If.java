package com.atguigu.if1;

import java.util.Scanner;

public class Demo2If {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a == b) {
            System.out.println("a=b");

        }else if (a>b){
            System.out.println("a>b");
        }else if (a<b){
            System.out.println("a<b");
        }
    }
}
