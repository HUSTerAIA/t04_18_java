package com.atguigu.file1;

import java.io.File;

public class File1 {
    public static void main(String[] args) {
//路径分隔符
        String pathSep= File.pathSeparator;     // 路径分隔符；
        System.out.println(pathSep);
        //
        String sep = File.separator;            // 路径名称分隔符
        System.out.println(sep);

        String path="D:"+File.separator+"java0";
        System.out.println(path);

    }
}
