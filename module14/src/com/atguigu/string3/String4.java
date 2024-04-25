package com.atguigu.string3;

public class String4 {
    public static void main(String[] args) {
        String s1="  SHDGSsjhfjs .sdhjf4  834,sdf h ";
        System.out.println(s1.contains("a"));
        System.out.println(s1.endsWith("h"));
        System.out.println(s1.startsWith("SH"));
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.trim());
        System.out.println(s1.replace(" ",""));
    }
}
