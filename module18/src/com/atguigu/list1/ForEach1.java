package com.atguigu.list1;

import java.util.ArrayList;

public class ForEach1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();       // 集合list
        list.add("a");      // 添加指定string元素
        list.add("b");
        list.add("c");
        list.add("d");
//增强for
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("===============");
        int[] nums = {1, 2, 3, 4, 5};           // 数组int[]
        for (int num : nums) {
            System.out.println(num);
        }

    }
}
