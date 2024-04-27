package com.atguigu.genericity1;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<String> list1=new ArrayList<>();
        ListUtils1.addAll(list1,"sd","rt","rfxc");
        System.out.println(list1);

        ArrayList<Integer> list2=new ArrayList<>();
        ListUtils1.addAll(list2,2,4,6,2);
        System.out.println(list2);
    }
}
