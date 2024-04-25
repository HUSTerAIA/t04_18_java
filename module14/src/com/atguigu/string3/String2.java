package com.atguigu.string3;

import java.util.Scanner;

public class String2 {
    public static void main(String[] args) {
        /*
        键盘录入一个字符串，统计字符串大写字母字符，小写字母字符，数字字符出现的次数；
        1.创建键盘录入对象
        2.调用next方法，接受
        3.定义三个变量用于统计出现次数
        4.录入字符转换
        5.UTF-8范围比较

         */
        int num_a = 0;
        int num_1 = 0;
        int num_A = 0;
        //录入
        System.out.println("输入字符串（大小写字母，数字）");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        //转换
        byte[] bytes = str.getBytes();
        char[] chars=str.toCharArray();
        //判断
        for (int i = 0; i < bytes.length; i++) {
            if (bytes[i] >= 65 && bytes[i] <= 90) {
                num_A++;
            } else if (bytes[i] >= 97 && bytes[i] <= 122) {
                num_a++;
            } else if (chars[i] >= '1' && chars[i]<='9') {
                num_1++;
            }

        }
//输出
        System.out.println("小写字母个数：" + num_a);
        System.out.println("大写字母个数：" + num_A);
        System.out.println("数字个数：" + num_1);
    }
}
