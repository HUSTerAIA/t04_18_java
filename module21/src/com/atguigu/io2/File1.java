package com.atguigu.io2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * IO流：字符流
 * 读取文件
 */
public class File1 {
    public static void main(String[] args) throws IOException {
        /*
        读取字符流
         */

        FileReader fr = new FileReader("io/3.txt");     // 字符流对象
        int len;
        while ((len = fr.read()) != -1) {       // 返回读取的字节:二进制int
            System.out.println((char) len);     // 强制转成char

        }
        fr.close();

        System.out.println("-----------------");
        //连续读取多个
        FileReader fr1 = new FileReader("io/3.txt");
        char[] chars = new char[3];
        int len1;
        while ((len1 = fr1.read(chars)) != -1) {        // 返回读取的字节个数
            System.out.println(new String(chars, 0, len1));     // 读取整个chars

        }
        fr1.close();
    }
}
