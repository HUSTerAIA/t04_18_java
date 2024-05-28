package com.atgiugu.exception1;

import java.io.FileNotFoundException;

public class Exception4 {
    public static void main(String[] args) throws FileNotFoundException{    //异常往上throws
        /*
        手动处理异常
         */
        String s="sfh.java1";
        try {
            method1(s);
        }catch (Exception e){       // 处理顶端异常
            System.out.println(e);
        }finally {
            System.out.println("必须执行");     //不管是否存在异常都会执行
        }
    }

    public static void method1(String s)throws FileNotFoundException{   //异常往上throws
        if(!s.endsWith(".java")){
            //手动创建编译时异常对象
            throw new FileNotFoundException("文件找不到");
        }
    //上述出现异常则打印异常信息并停止运行
        System.out.println("无异常");
    }


}
