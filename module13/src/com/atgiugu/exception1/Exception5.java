package com.atgiugu.exception1;

import java.io.FileNotFoundException;

public class Exception5 {
    public static void main(String[] args) throws FileNotFoundException {    //异常往上throws
        int result=method1();
        System.out.println("result="+result);
    }

    public static int method1() {
        try {
            String s = null;
            System.out.println(s.length()); //空指针异常
            return 1;
        } catch (Exception e) {
            System.out.println(e);  //处理异常
            return 2;
        } finally {
            System.out.println("finally必须执行");
            return 3;   //结束方法
        }
    }


}
