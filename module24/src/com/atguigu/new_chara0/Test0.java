package com.atguigu.new_chara0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test0 {
    public static void main(String[] args) {
        ArrayList<Person0> list = new ArrayList<>();
        list.add(new Person0("dshgf",34));
        list.add(new Person0("dgf",4));
        list.add(new Person0("f",5));

        Collections.sort(list,new Comparator<>() {

            @Override
            public int compare(Person0 o1, Person0 o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        System.out.println(list);
    }
}
