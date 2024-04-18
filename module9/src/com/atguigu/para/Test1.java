package com.atguigu.para;

public class Test1 {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("参数" + (i + 1) +":"+ args[i]);
        }
    }


}
