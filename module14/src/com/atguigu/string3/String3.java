package com.atguigu.string3;

public class String3 {
    public static void main(String[] args) {
        //字符串分割
        String s1="afghs.fh,wejfjb";
        String[] s2=s1.split(",");      // 按照，分割
        for(int i=0;i<s2.length;i++){
            System.out.println(s2[i]);
        }
        System.out.println("========");
        String[] s3=s1.split("\\.");    // 反斜杠转义
        for (int i = 0; i < s3.length; i++) {
            System.out.println(s3[i]);
        }
    }
}
