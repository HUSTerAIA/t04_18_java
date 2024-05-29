package com.atguigu.string3;

public class String4 {
    public static void main(String[] args) {
        String s1="  SHDGSsjhfjs .sdhjf4  834,sdf h ";
        System.out.println(s1.contains("a"));   // 包含
        System.out.println(s1.endsWith("h"));   // 结尾
        System.out.println(s1.startsWith("SH"));        // 开头
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.trim());  // 去首尾空格
        System.out.println(s1.replace(" ",""));     // 替换
    }
}
