package com.atguigu.lambda1;

public class Lambda1 {
    public static void main(String[] args) {
        // 匿名内部类
        new Thread(new Runnable() {     // runnable是一个函数式接口，作为方法参数传递
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
