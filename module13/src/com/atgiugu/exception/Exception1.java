package com.atgiugu.exception;

public class Exception1 {
    public static void main(String[] args) {
        //创建异常
        String s="a.java";
        method(s);
    }

    public static void method(String s){
        if(!s.endsWith(".java")){
            throw new RuntimeException();   //手动创建随机异常
        }else{
            System.out.println(".java结尾");
        }
    }
}
