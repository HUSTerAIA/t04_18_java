package com.atguigu.io2;

import java.io.FileWriter;

public class File2 {
    public static void main(String[] args) throws Exception{
        /*
        字符流写入
         */
        FileWriter fw=new FileWriter("io\\4.txt");
        fw.write("abc\n");
        fw.write("def");
        fw.write("ghi\r");

        fw.flush();

        fw.write("jkl");

        fw.close();

    }
}
