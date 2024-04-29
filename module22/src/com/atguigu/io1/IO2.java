package com.atguigu.io1;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class IO2 {
    public static void main(String[] args) throws Exception {
        OutputStreamWriter osw = new OutputStreamWriter(
                new FileOutputStream("io\\8.txt")
        );
        osw.write("你好abc");
        osw.close();
    }
}
