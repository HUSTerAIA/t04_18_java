package com.atguigu.io1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy1 {
    public static void main(String[] args) throws IOException {
        /*
        文件复制
        1.创建对象读取指定文件；
        2.创建对象将读取到的数据写入指定文件；
        3.边读边写
         */

        FileInputStream fis = new FileInputStream("io/1.jpg");      //读取
        FileOutputStream fos = new FileOutputStream("io/1_copy.jpg");       //写入

        //读取到的数据临时存放
        byte[] bytes = new byte[1024];
        //读取到的字节长度
        int len;
        while ((len = fis.read(bytes)) != -1) {
//            fis.read(bytes,0,len);
            fos.write(bytes, 0, len);
        }

        fos.close();        //习惯先关读取
        fis.close();


    }
}
