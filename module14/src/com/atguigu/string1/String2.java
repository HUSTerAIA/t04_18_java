package com.atguigu.string1;

public class String2 {
    public static void main(String[] args) {
/*        2.String(String original);    //根据字符串original创建
        3.String(char[] value);        //根据char[]数组创建
        4.String(byte[] bytes);    //通过使用平台的默认字符集解码指定的字节数组来构造新的 String
        平台：操作系统
        操作系统默认字符集：GBK
        GBK：一个中文占2字节
        UTF-8：一个中文占3字节
                中文对应字节一般为负数

        5.简化形式
        String s="xxx";*/

        String s=new String();
        System.out.println(s);

        String s0=new String("ab");
        System.out.println(s0);

        char[] value={'a','b'};
        String s1=new String(value);
        System.out.println(s1);

        byte[] bytes={'a','b'};
        String s2=new String(bytes);
        System.out.println(s2);

        String s3="ab";
        System.out.println(s3);

    }

}
