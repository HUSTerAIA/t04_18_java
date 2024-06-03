package com.atguigu.regex1;

import java.util.Arrays;

/**
 * 正则表达式
 */
public class Regex1 {
    public static void main(String[] args) {
        method();
        System.out.println("------------");
        method1();
        System.out.println("------------");
        method2();
        System.out.println("------------");
        method3();
        System.out.println("------------");
        method4();
        System.out.println("------------");
        method5();
    }

    public static void method() {
        //验证字符串
        boolean reg1 = "hgfhd".matches("[h][agfjhd][d]");       // 首位h，第二位agfjhd中的一个，第三位d
        System.out.println("reg1 = " + reg1);

        boolean reg2 = "hgfhd".matches("[h][^agfjhd][d]");      // 第二位不是agfjhd
        System.out.println("reg2 = " + reg2);

        boolean reg3 = "Adhjad".matches("[A-Z][a][d]");     // 第一位A-Z中的一个
        System.out.println("reg3 = " + reg3);
    }

    public static void method1() {
        //字符串首位为小写字母，而且不能以[abc]开头，末尾为de
        boolean reg1 = "tde".matches("[[a-z]&&[^abc]][d][e]");
        System.out.println("reg1 = " + reg1);

        //字符串首位为小写字母，或[ABC]开头，末尾为de
        boolean reg2 = "Dde".matches("[[a-z]|[ABC]][d][e]");
        System.out.println("reg2 = " + reg2);
    }

    public static void method2() {
        //三位数字
        boolean reg1 = "243".matches("\\d\\d\\d");      // \转义
        System.out.println("reg1 = " + reg1);
        //首位单词字符[a-zA-Z0-9],第二位随意
        boolean reg2 = "3s".matches("\\w.");        // 单词字符
        System.out.println("reg2 = " + reg2);
    }

    public static void method3() {
        //5位数字
        boolean reg1 = "12345".matches("\\d{5}");
        System.out.println("reg1 = " + reg1);

        //1开头，第二位1，2，3，第三位0-9
        boolean rerg2 = "130".matches("[1][1-3][\\d]");
        System.out.println("rerg2 = " + rerg2);

        //第一位不是0，长度11
        boolean reg3 = "12345678901".matches("[1-9][\\d]{10}");     // 数字出现10次
        System.out.println("reg3 = " + reg3);

    }

    public static void method4() {
        //abc出现任意次
        boolean reg = "abcabc".matches("(abc)*");       // abc出现次数>=0
        System.out.println("reg = " + reg);
    }

    public static void method5() {
        String s = "abc hdjf   jkerf";
        //根据空格拆分
        String[] arr = s.split(" +");       // 空格出现次数>=1
        System.out.println("arr = " + Arrays.toString(arr));

        //特换空格为@
        String s1 = s.replaceAll(" +", "@");
        System.out.println("s1 = " + s1);
    }
}
