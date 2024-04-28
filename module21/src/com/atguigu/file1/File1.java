package com.atguigu.file1;

import java.io.File;

public class File1 {
    public static void main(String[] args) {
//路径分隔符
        String pathSep= File.pathSeparator;
        System.out.println(pathSep);
        //
        String sep = File.separator;
        System.out.println(sep);

        String path="D:"+File.separator+"java";
        System.out.println(path);

    }
}
