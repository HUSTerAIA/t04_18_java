package com.atguigu.string2;

public class Stirng1 {
    public static void main(String[] args) {
/*        1.String(char[] value, int offset, int count)
//value:要转的char[]数组；offset：从数组哪个位置开始转；count：转多少个

        2.String(byte[] bytes, int offset, int length)
//类似*/
        char[] chars={'a','b','c','d','e','f','g','h'};
        String s1=new String(chars,3,2);
        System.out.println(s1);

        byte[] bytes={'a','b','c','d','e','f','g','h'};
        String s2=new String(bytes,3,3);
        System.out.println(s2);

    }
}
