package com.atguigu.file1;

import java.io.File;
import java.io.IOException;

public class File3 {
    public static void main(String[] args) throws IOException {
        //获取File绝对路径：带盘符
        File file1 = new File("1.txt");
        System.out.println(file1.getAbsolutePath());

        //获取封装路径，new对象时的指定路径
        File file2 = new File("io\\1.jpg");
        System.out.println(file2.getPath());

        //获取文件、文件夹名称
        System.out.println(file2.getName());

        //获取文件的长度：文件字节数
        File file3 = new File("D:\\JetBrains\\workspace\\test\\io\\1.jpg");
        System.out.println(file3.length());


//        method();
//        method1();
//        method2();
        System.out.println("-------------------");
        method3();


    }


    public static void method() throws IOException {
        //创建文件
        File file1 = new File("D:\\JetBrains\\workspace\\test\\io\\1.jpg");
        System.out.println(file1.createNewFile());

        File file2 = new File("D:\\JetBrains\\workspace\\test\\io\\1.txt");
        System.out.println(file2.createNewFile());

        //创建文件夹
        File file3 = new File("D:\\JetBrains\\workspace\\test\\io\\io1\\io2");
        System.out.println(file3.mkdirs());
    }

    public static void method1() throws IOException {
        File file1 = new File("D:\\JetBrains\\workspace\\test\\io\\1.txt");
        System.out.println("file1.delete() = " + file1.delete());

        File file2 = new File("D:\\JetBrains\\workspace\\test\\io\\io1\\io2");
        System.out.println("file2.delete() = " + file2.delete());
    }

    public static void method2() throws IOException {
        File file1 = new File("D:\\JetBrains\\workspace\\test\\io\\1.jpg");
        System.out.println("file1.isDirectory() = " + file1.isDirectory());
        System.out.println("file1.isFile() = " + file1.isFile());
        System.out.println("file1.exists() = " + file1.exists());
    }

    public static void method3() throws IOException {
        //遍历文件夹里面的对象
        File file1 = new File("D:\\JetBrains\\workspace\\test\\io");
        String[] list = file1.list();
        for (String s : list) {
            System.out.println(s);
        }

        File[] files=file1.listFiles();
        for(File f:files){
            System.out.println(f);
        }
    }
}
