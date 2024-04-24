package com.atgiugu.exception1;

public class Exception2 {
    public static void main(String[] args) throws Exception {
        String s = "ahfj.java";
        method1(s);
    }

    public static void method1(String s) throws Exception{  //上抛父类异常对象
        //创建两个异常
        if (s == null) {
            throw new NullPointerException();
        }

        if (!s.endsWith(".java")) {
            throw new NullPointerException("文件异常");
        }

        System.out.println("无异常");
    }
}
