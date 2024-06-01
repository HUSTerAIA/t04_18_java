package com.atguigu.io1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 写文件
 */
public class Io1 {
    public static void main(String[] args) throws IOException {
        /*
        写数据
         */

        method1();
        method2();
        method3();
        method4();
        method5();
    }

    public static void method1() throws IOException {
        //写入一个字节
        FileOutputStream fos = new FileOutputStream("io\\1.txt");
        fos.write(97);
        fos.close();
    }

    public static void method2() throws IOException {
        //写入多个字节
        FileOutputStream fos = new FileOutputStream("io\\1.txt");
        byte[] bytes = {97, 98, 99};
        fos.write(bytes);
        fos.close();
    }

    public static void method3() throws IOException {
        //写入多个字节
        FileOutputStream fos = new FileOutputStream("io\\1.txt");
        byte[] bytes = {97, 98, 99,100};
        fos.write(bytes,1,2);
        fos.close();
    }

    public static void method4() throws IOException {
        //写入多个字节
        FileOutputStream fos = new FileOutputStream("io\\1.txt");
//        byte[] bytes = {97, 98, 99,100};
        fos.write("你好".getBytes());     // string字符串转成bytes数组
        fos.close();
    }

    public static void method5() throws IOException {
        //字节追加
        FileOutputStream fos = new FileOutputStream("io\\1.txt",true);
//        byte[] bytes = {97, 98, 99,100};
        fos.write("im\r\n".getBytes());
        fos.write("hello\n".getBytes());
        fos.write("world\r".getBytes());
        fos.write("hi\r".getBytes());
        fos.close();
    }
}
