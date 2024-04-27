package com.atguigu.collections1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Collections2 {
    public static void main(String[] args) {
        Person1 p1 = new Person1(18, "张三");
        Person1 p2 = new Person1(19, "李四");
        Person1 p3 = new Person1(56, "王五");

        ArrayList list = new ArrayList();
        Collections.addAll(list, p1, p2, p3);
        //按照比较器排序
        Collections.sort(list, new Comparator<Person1>() {
            @Override
            public int compare(Person1 o1, Person1 o2) {
                return o1.getAge() - o2.age;
            }
        });
        System.out.println(list);


        Person2 p4 = new Person2(18, "a");
        Person2 p5 = new Person2(19, "b");
        Person2 p6 = new Person2(56, "c");

        ArrayList list2 = new ArrayList();
        Collections.addAll(list2, p4, p5, p6);

        Collections.sort(list2);
        System.out.println(list2);
    }
}
