package com.atguigu.io1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInput1 {
    public static void main(String[] args) throws IOException {
        /*
        文件读取
         */
        FileInputStream fis = new FileInputStream("io\\2.txt");
//        method1(fis);
        method2(fis);

    }

    public static void method1(FileInputStream fis) throws IOException {
        int data1 = fis.read();
        System.out.println(data1);
//        int data2=fis.read();
//        System.out.println(data2);
//        int data3=fis.read();
//        System.out.println(data3);
//        int data4=fis.read();
//        System.out.println(data4);
//        int data5=fis.read();
//        System.out.println(data5);

        int data;
        while ((data = (fis.read())) != -1) {
            System.out.println((char) data);
        }
        fis.close();
    }

    public static void method2(FileInputStream fis) throws IOException {
        //读取全部为数组
        /*
        创建数组byte[]作为临时存储区域，将依次读取的数组存入数组，每次打印；
        数组定义多长，每次读取多少个数据，一般定义为1024的倍数；
        如果剩余字节不够则有多少读取多少，剩余空间仍然保存上一次读取的部分数据；
         */
        byte[] bytes = new byte[2];
        int len = fis.read(bytes);
        System.out.println(len);
        System.out.println(new String(bytes, 0, len));

        System.out.println("-------------");
        /*
        一次性连续读取
         */
        //定义变量接受读取到的字节数
        int num;
        while ((num = fis.read(bytes)) != -1) {     //有效数据
            System.out.println(new String(bytes, 0, num));
        }

        fis.close();


    }
}
