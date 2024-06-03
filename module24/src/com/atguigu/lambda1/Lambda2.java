package com.atguigu.lambda1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Lambda2 {
    public static void main(String[] args) {
        Person1 person = new Person1("abc", 18);
        Person1 person2 = new Person1("d", 20);
        Person1 person3 = new Person1("e", 26);

        //按照年龄排序
        ArrayList<Person1> pList = new ArrayList<>();
        pList.add(person);
        pList.add(person2);
        pList.add(person3);

        Collections.sort(pList, new Comparator<Person1>() {     // 匿名内部类，函数式接口作为方法参数传递
            @Override
            public int compare(Person1 o1, Person1 o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        for (Person1 p : pList) {
            System.out.println(p);
        }

        System.out.println("----------------lambda--------------");
        Collections.sort(pList, (Person1 o1, Person1 o2) -> {       // 重写方法参数（）->重写方法体{}
            return o1.getAge() - o2.getAge();

        });
        for (Person1 p : pList) {
            System.out.println(p);
        }
        System.out.println("--------------简化lambda-------------------");
        Collections.sort(pList, (o1, o2) ->     // 重写方法的参数类型省略
                o1.getAge() - o2.getAge()       // 方法体只有一句话
        );
        for (Person1 p : pList) {
            System.out.println(p);
        }
    }
}
