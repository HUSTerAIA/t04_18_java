package com.atguigu.map2;

import java.util.HashMap;

public class Test1 {
    public static void main(String[] args) {
        HashMap<Person1,String> map=new HashMap<>();
        map.put(new Person1("a",27),"A");
        map.put(new Person1("b",24),"B");
        map.put(new Person1("a",27),"A");       //需要重写hashcode

        System.out.println(map);

    }
}
