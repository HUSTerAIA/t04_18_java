package com.atguigu.io;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * 字符流write、read
 * 缓冲流
 * 读取文件
 */
public class BufferedRead1 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("io\\6.txt"));
        String line = null;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }
}
