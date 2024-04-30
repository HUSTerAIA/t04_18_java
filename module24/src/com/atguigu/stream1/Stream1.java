package com.atguigu.stream1;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Stream1 {
    public static void main(String[] args) {
        //stream流
        ArrayList<String> list = new ArrayList<String>();
        list.add("Adhjgf");
        list.add("Addebngf");
        list.add("Adjhggf");
        list.add("jhgf");
        list.add("jhg23gf");

        Stream<String> stream=list.stream();
        stream.filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("A");
            }
        }).filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length()>2;
            }
        }).forEach(new Consumer<String>(){
            public void accept(String s) {
                System.out.println(s);
            }
        });

    }
}
