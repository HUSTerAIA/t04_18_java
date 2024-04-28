package com.atguigu.treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class Treeset1 {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet();
        ts.add("abds");
        ts.add("bshjfd");
        ts.add("adfg");
        ts.add("cfdhd");
        //默认自动排序（ASCII)
        System.out.println(ts);

        System.out.println("=========-------------====");
        //自定义比较器
        TreeSet<Person> ts2=new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        });

        ts2.add(new Person("abds", 22));
        ts2.add(new Person("bshjfd", 23));
        ts2.add(new Person("adfg", 24));
        ts2.add(new Person("cfdhd", 25));
        System.out.println(ts2);
    }
}
