package com.atguigu.list1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.stream.Stream;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();     // 集合list对象
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        System.out.println(list);
        //首位增加
        list.addFirst("0");     // 首位
        System.out.println(list);
        //末尾增加
        list.addLast("1");      // 末尾
        System.out.println(list);
        //删除
        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
        //提取
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        Iterator<String> iter=list.iterator();      // 逐个输出
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
        System.out.println("-----------------------");
        for (String s:list){
            System.out.println(s);
        }


        list.pop();     // 首位弹栈
        System.out.println(list);

        list.push("e");     // 首位圧栈
        System.out.println(list);

    }
}
