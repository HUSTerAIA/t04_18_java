package com.atguigu.list1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.stream.Stream;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        System.out.println(list);
        //首位增加
        list.addFirst("0");
        System.out.println(list);
        //末尾增加
        list.addLast("1");
        System.out.println(list);
        //删除
        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
        //提取
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        Iterator<String> iter=list.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }

        list.pop();
        System.out.println(list);

        list.push("e");
        System.out.println(list);
    }
}
