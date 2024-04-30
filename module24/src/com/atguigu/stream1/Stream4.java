package com.atguigu.stream1;

import javax.swing.*;
import java.util.ArrayList;
import java.util.stream.Stream;

public class Stream4 {
    public static void main(String[] args) {
        //两个队伍
        ArrayList<String> list1 = new ArrayList();
        list1.add("sdf");
        list1.add("asasdf");
        list1.add("sdrerf");
        list1.add("assdrgsdf");

        ArrayList<String> list2 = new ArrayList();
        list2.add("bhjd");
        list2.add("baghsds");
        list2.add("cjgdf");

        //变成流
        Stream<String> stream1 = list1.stream();
        Stream<String> stream2 = list2.stream();

        //list1筛选长度>3，前2个
        Stream<String> l1 = stream1.filter(s -> s.length() > 3).limit(2);
        //list2筛选首字母为b，跳过第一个
        Stream<String> l2 = stream2.filter(s -> s.startsWith("b")).skip(1);
        //合并
        Stream.concat(l1, l2).forEach(s -> System.out.println(s));
    }
}
