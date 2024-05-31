package com.atguigu.collections1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Collections2 {
    public static void main(String[] args) {
        Person1 p1 = new Person1(18, "张三");
        Person1 p2 = new Person1(19, "李四");
        Person1 p3 = new Person1(56, "王五");

        ArrayList list = new ArrayList();       // 集合list
        Collections.addAll(list, p1, p2, p3);
        //按照比较器排序
        /*
        1. 创建接口的实现类对象
        2. 重写抽象方法
         */
        Collections.sort(list, new Comparator<Person1>() {      // 匿名内部类，泛型指定输入Person1类型
            @Override
            public int compare(Person1 o1, Person1 o2) {
                return o2.age-o1.getAge() ;        // 成员属性age访问权限：默认空；降序排序
            }
        });
        System.out.println(list);


        Person2 p4 = new Person2(12, "a");
        Person2 p5 = new Person2(10, "b");
        Person2 p6 = new Person2(51, "c");

        ArrayList list2 = new ArrayList();
        Collections.addAll(list2, p4, p5, p6);

        Collections.sort(list2);        // 重写排序规则
        System.out.println(list2);
    }
}
