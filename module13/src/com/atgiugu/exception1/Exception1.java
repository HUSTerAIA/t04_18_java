package com.atgiugu.exception1;

import java.io.FileNotFoundException;

public class Exception1 {
    public static void main(String[] args) throws FileNotFoundException{
        //异常往上throws,方法参数和方法体之间throws 异常
        /*
        手动处理异常
         */
        String s="sfh.java1";
        method1(s);
        method2();
    }

    public static void method1(String s)throws FileNotFoundException{   //异常往上throws
        if(!s.endsWith(".java")){
            //手动创建编译时异常对象
            throw new FileNotFoundException("文件找不到");   // 直接停止运行
        }
    //上述出现异常则打印异常信息并停止运行
        System.out.println("无异常");
    }

    public static void method2(){
        System.out.println("方法2");
    }

}
