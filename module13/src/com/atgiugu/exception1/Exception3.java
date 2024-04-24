package com.atgiugu.exception1;

import java.io.FileNotFoundException;

public class Exception3 {
    public static void main(String[] args) {
//        String s = "ahfj.java";

        String s=null;
        try{
            method1(s);
        }catch(NullPointerException n){
            System.out.println(n);
        }catch(FileNotFoundException f){
            System.out.println(f);
        }
        //前面出现异常，处理，后面继续执行
        method3();

        try{
            method2(s);
        }catch(Exception e){
            e.printStackTrace();    //打印详细信息；
        }

        method4();
    }

    public static void method1(String s) throws NullPointerException,FileNotFoundException{  //上抛父类异常对象
        //创建两个异常
        if (s == null) {
            throw new NullPointerException();
        }

        if (!s.endsWith(".java")) {
            throw new FileNotFoundException("文件异常");
        }

        System.out.println("无异常");
    }

    public static void method2(String s) throws Exception {
        if (s == null) {
            throw new NullPointerException();
        }
    }
    public static void method3(){
        System.out.println("方法3");
    }

    public static void method4(){
        System.out.println("方法4");
    }
}
