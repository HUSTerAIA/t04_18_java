package com.atguigu.collections1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Collections1 {
    public static void main(String[] args) {
        //批量添加
        ArrayList<String> list1=new ArrayList<>();
        Collections.addAll(list1,"a","b","c","d");
        System.out.println(list1);
        //顺序打乱
        Collections.shuffle(list1);
        System.out.println(list1);
        //按照默认规则ASCII将元素逐个比较排序
        list1.add("A");
        System.out.println(list1);
        Collections.sort(list1);
        System.out.println(list1);
    }
}
