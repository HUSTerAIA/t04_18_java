package com.atguigu.printstream1;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * 打印流
 * 日志存入文件
 */
public class PrintStream1 {
    public static void main(String[] args) throws FileNotFoundException {
        //打印流
        PrintStream ps=new PrintStream("io\\0.txt");
        //改变流向
        System.setOut(ps);

        System.out.println("abc");
        System.out.println("你好");
        ps.close();     // 关闭流
    }
}
