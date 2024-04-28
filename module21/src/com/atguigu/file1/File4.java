package com.atguigu.file1;

import java.io.File;

public class File4 {
    /*
    查询某一个文件夹下所有jpg文件
    1.创建file对象
    2.遍历得到filelist
    3.判断后缀名
    4.递归
     */
    public static void main(String[] args) {
        File file = new File("D:\\JetBrains\\workspace\\test\\io");
        method(file);

    }

    public static void method(File file) {
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isFile()) {
                String name = f.getName();
                if (name.endsWith(".jpg")) {
                    System.out.println(f);
                }
            } else {
                method(f);      //文件夹递归
            }
        }
    }
}
