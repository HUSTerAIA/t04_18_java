package com.atguigu.file1;

import java.io.File;

public class File2 {
    public static void main(String[] args) {
        File file1 = new File("D:\\JetBrains\\workspace\\test\\io", "1.jpg");
        System.out.println(file1);

        File file2 = new File("D:\\JetBrains\\workspace\\test\\io");
        File file3 = new File(file2, "2.jpg");
        System.out.println("file3 = " + file3);

        File file4 = new File("D:\\JetBrains\\workspace\\test\\io\\3.jpg");
        System.out.println("file4 = " + file4);
    }
}
