package com.atguigu.io;

import java.io.*;

/**
 * 基本流包装成缓冲流
 */
public class IO1 {
    public static void main(String[] args) throws Exception {
        //文件复制
        method1();
        method2();

    }

    public static void method1() throws Exception {
        //基本流复制
        long start = System.currentTimeMillis();

        FileInputStream fis = new FileInputStream("io\\1.jpg");     // IO流：字节流：基本流：输入流
        FileOutputStream fos = new FileOutputStream("io\\1_copy.jpg");
        //边读边写
        int len;
        while ((len = fis.read()) != -1) {
            fos.write(len);
        }


        //测试时间
        long end = System.currentTimeMillis();
        System.out.println("基本流复制用时：" + (end - start));
        fos.close();
        fis.close();
    }

    /**
     * 基本流转成缓冲流
     * @throws Exception
     */
    public static void method2() throws Exception {
        //缓冲流复制
        long start = System.currentTimeMillis();

        FileInputStream fis = new FileInputStream("io\\1.jpg");  // IO流：字节流：缓冲流：输入流
        FileOutputStream fos = new FileOutputStream("io\\1_copy.jpg");

        //缓冲流对象
        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        //边读边写
        int len;
        while ((len = bis.read()) != -1) {
            bos.write(len);
        }


        //测试时间
        long end = System.currentTimeMillis();
        System.out.println("缓冲流复制用时：" + (end - start));
        bos.close();        //只需要关闭缓冲流
        bis.close();
    }
}
