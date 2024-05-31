package com.atguigu.collections1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Collections1 {
    public static void main(String[] args) {
        //批量添加
        ArrayList<String> list1=new ArrayList<>();      // 集合list
        Collections.addAll(list1,"a","b","c","d");      // 集合顶级接口的静态成员方法
        System.out.println(list1);
        //顺序打乱
        Collections.shuffle(list1);
        System.out.println(list1);
        //按照默认规则ASCII将元素逐个比较排序
        list1.add("A");     // 集合list的非静态方法
        System.out.println(list1);
        Collections.sort(list1);        // 默认ASCII表顺序排序
        System.out.println(list1);
    }
}
