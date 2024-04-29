package com.atguigu.io;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriter1 {
    public static void main(String[] args) throws Exception{
        BufferedWriter bw=new BufferedWriter(new FileWriter("io\\6.txt",true));
        bw.write("abc");
        bw.newLine();
        bw.write("hello");
        bw.newLine();
        bw.write("你好");
        bw.close();
    }
}
