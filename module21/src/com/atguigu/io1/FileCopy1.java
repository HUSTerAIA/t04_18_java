package com.atguigu.io1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * IO流：字节流
 *
 * 复制文件
 */
public class FileCopy1 {
    public static void main(String[] args) throws IOException {
        /*
        文件复制
        1.创建对象读取指定文件；
        2.创建对象将读取到的数据写入指定文件；
        3.边读边写
         */

        //1.创建读取、写入文件对象
        FileInputStream fis = new FileInputStream("io/1.jpg");      //读取
        FileOutputStream fos = new FileOutputStream("io/1_copy.jpg");       //写入

        //读取到的数据临时存放
        // 2.创建字节数组对象存过程中的数据
        byte[] bytes = new byte[1024];
        //读取到的字节长度
        // 3.文件对象读写数据
        int len;
        while ((len = fis.read(bytes)) != -1) {
//            fis.read(bytes,0,len);
            fos.write(bytes, 0, len);
        }

        // 4.关闭文件对象
        fos.close();        //先开io后关oi
        fis.close();


    }
}
