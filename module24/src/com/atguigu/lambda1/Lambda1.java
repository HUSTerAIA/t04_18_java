package com.atguigu.lambda1;

public class Lambda1 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("abc");
            }
        }).start();


        System.out.println("-----lambda表达式----------------");

        new Thread(
                () -> {
                    System.out.println("def");
                }).start();
    }
}
