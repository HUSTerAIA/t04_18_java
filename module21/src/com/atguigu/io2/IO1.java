package com.atguigu.io2;

import java.io.FileWriter;

public class IO1 {
    /*
    IO异常处理
     */
    public static void main(String[] args) {
        try(FileWriter fw=new FileWriter("io\\5.txt");){
            fw.write("你好");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
