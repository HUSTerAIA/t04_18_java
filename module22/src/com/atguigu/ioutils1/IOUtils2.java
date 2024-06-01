package com.atguigu.ioutils1;

import org.apache.commons.io.FileUtils;

import java.io.File;

/**
 * file工具类
 * 复制文件夹
 */
public class IOUtils2 {
    public static void main(String[] args) throws Exception {
        //复制整个目录
        FileUtils.copyDirectory(new File("io\\io1"), new File("io\\io2"));
        //写入数据
        FileUtils.write(new File("io\\11.txt"), "afhds爱很简单");
        String str0 = FileUtils.readFileToString(new File("io\\11.txt"), "utf-8");
        System.out.println("str0 = " + str0);

        FileUtils.write(new File("io\\11.txt"), "srfdfnd");     // 写入覆盖
        //读取文件
        String str = FileUtils.readFileToString(new File("io\\11.txt"), "utf-8");
        System.out.println("str = " + str);
        System.out.println("------------------------");
        String str1 = FileUtils.readFileToString(new File("io\\1.txt"), "utf-8");
        System.out.println("str1 = " + str1);
    }
}
