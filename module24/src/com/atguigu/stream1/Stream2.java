package com.atguigu.stream1;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Stream2 {
    public static void main(String[] args) {
        //针对collection集合的方法
        ArrayList<String> list = new ArrayList<String>();
        list.add("Adhjgf");
        list.add("Addebngf");
        list.add("Adjhggf");
        list.add("jhgf");
        list.add("jhg23gf");

        Stream<String> stream=list.stream();
        System.out.println(stream);

        //针对数组的方法
        Stream<String> stream1=Stream.of("Adhjgf","Addebngf","Adjhggf");
        System.out.println(stream1);
    }
}
