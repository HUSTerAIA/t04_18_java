package com.atguigu.io2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class File1 {
    public static void main(String[] args) throws IOException {
        /*
        读取字符流
         */

        FileReader fr = new FileReader("io/3.txt");
        int len;
        while ((len = fr.read()) != -1) {
            System.out.println((char) len);

        }
        fr.close();

        System.out.println("-----------------s");
        //连续读取多个
        FileReader fr1 = new FileReader("io/3.txt");
        char[] chars = new char[3];
        int len1;
        while ((len1 = fr1.read(chars)) != -1) {
            System.out.println(new String(chars, 0, len1));

        }
        fr1.close();
    }
}
