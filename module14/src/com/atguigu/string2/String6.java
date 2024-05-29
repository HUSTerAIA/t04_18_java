package com.atguigu.string2;

public class String6 {
    public static void main(String[] args) {
        String s="0123456";
        System.out.println(s.length());
        System.out.println(s.concat("789"));    // 拼接
        System.out.println(s.charAt(2));        // 查找对应位置元素
        System.out.println(s.indexOf('5'));     // 查找元素对应位置
        System.out.println(s.substring(3));     // 子串
        System.out.println(s.substring(3,5));       // 子串

        System.out.println("==============");
        //遍历
        for(int i=0;i<s.length();i++){
            System.out.println(s.charAt(i));
        }
    }
}
