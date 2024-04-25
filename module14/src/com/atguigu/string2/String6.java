package com.atguigu.string2;

public class String6 {
    public static void main(String[] args) {
        String s="0123456";
        System.out.println(s.length());
        System.out.println(s.concat("789"));
        System.out.println(s.charAt(2));
        System.out.println(s.indexOf('5'));
        System.out.println(s.substring(3));
        System.out.println(s.substring(3,5));

        System.out.println("==============");
        //遍历
        for(int i=0;i<s.length();i++){
            System.out.println(s.charAt(i));
        }
    }
}
