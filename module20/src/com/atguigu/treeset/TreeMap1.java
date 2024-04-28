package com.atguigu.treeset;

import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMap1 {
    public static void main(String[] args) {
        TreeMap<Integer,String> tm = new TreeMap();
        tm.put(1,"abds");
        tm.put(2,"bshjfd");
        tm.put(1,"adfg");
        tm.put(3,"cfdhd");
        //默认自动排序（ASCII)
        System.out.println(tm);

        System.out.println("------------------------");
        //自定义比较器
        TreeMap<Person,String> tm2=new TreeMap<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        });

        tm2.put(new Person("abds", 28)  ,"a");
        tm2.put(new Person("bshjfd", 23),"b"  );
        tm2.put(new Person("adfg", 24)  ,"h");
        tm2.put(new Person("cfdhd", 25) ,"e" );
        System.out.println(tm2);
    }
}
