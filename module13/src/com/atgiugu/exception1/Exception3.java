package com.atgiugu.exception1;

import java.io.FileNotFoundException;

public class Exception3 {
    public static void main(String[] args) {
//        String s = "ahfj.java";

        String s=null;
        try{
            method1(s);
        }catch(NullPointerException n){ //分别处理两个异常
            System.out.println(n);
        }catch(FileNotFoundException f){
            System.out.println(f);
        }
        //前面出现异常，处理，后面继续执行，不处理异常将停止运行
        method3();
        method4();
        try{
            method2(s);
        }catch(Exception e){        // 处理顶端异常
            e.printStackTrace();    //打印详细信息；
        }       // 异常将在最后输出？

        method4();
    }

    public static void method1(String s) throws NullPointerException,FileNotFoundException{  //上抛两个异常对象
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
