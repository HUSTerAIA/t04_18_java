package com.atguigu.io2;

import java.io.FileWriter;

/**
 * io流：字符流
 * 写入文件
 */
public class File2 {
    public static void main(String[] args) throws Exception{
        /*
        字符流写入
         */
        FileWriter fw=new FileWriter("io\\4.txt");      // 字符流对象
        fw.write("abc\n");
        fw.write("def");
        fw.write("ghi\r");

        fw.flush();     // 缓冲区数据刷入文件

        fw.write("jkl");            // 继续写入

        fw.close();

    }
}
