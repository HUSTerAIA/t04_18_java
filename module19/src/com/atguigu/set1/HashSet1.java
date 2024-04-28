package com.atguigu.set1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<String>();
        set1.add("A");
        set1.add("B");
        set1.add("C");
        set1.add("A");
        set1.add("a");

        System.out.println(set1);

        Iterator<String> iter = set1.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        System.out.println("===========");

        LinkedHashSet<String> set2 = new LinkedHashSet<>();
        set2.add("A");
        set2.add("B");
        set2.add("C");
        set2.add("A");
        set2.add("a");
        System.out.println(set2);
        for (String s : set2) {
            System.out.println(s);
        }
    }
}
