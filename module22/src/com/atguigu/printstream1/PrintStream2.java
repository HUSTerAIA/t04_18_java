package com.atguigu.printstream1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * 打印流续写
 * 日志附加进入文件
 */
public class PrintStream2 {
    public static void main(String[] args) throws FileNotFoundException {
        //打印流
        PrintStream ps=new PrintStream(new FileOutputStream("io\\0.txt",true));
        //改变流向
        System.setOut(ps);

        System.out.println("def");
        System.out.println("我是");
        ps.close();
    }
}
