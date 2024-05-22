package com.atguigu.method;

public class Demo3Method {
    public static void main(String[] args) {
        int i = 10;
        int j = 20;
//传递的是i和j，但是我们真正传递的是i和代表的数据，不是变量本身
        boolean result = compare(i, j);
        System.out.println("result = " + result);
    }

    public static boolean compare(int a, int b) {       // 形参
        //无法调用i,j
        if (a > b) {
            return true;
        } else {
            return false;
        }

    }

}
