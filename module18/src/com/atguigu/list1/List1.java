package com.atguigu.list1;

import java.util.ArrayList;
import java.util.Iterator;

public class List1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();     // 集合list对象
        list.add("a");      // 添加元素
        list.add("b");
        list.add("c");
        list.add("d");
        System.out.println(list);
        //指定索引添加
        list.add(2, "e");       // 指定位置
        System.out.println(list);
        //删除指定元素
        list.remove("b");       // 删除元素
        System.out.println(list);
        //删除指定索引位置的元素
        String s = list.remove(3);      // 删除索引元素
        System.out.println("s = " + s);
        System.out.println(list);
        //修改索引位置元素
        list.set(2, "f");
        System.out.println(list);
        //获取索引位置元素
        String s1 = list.get(1);        // 获取
        System.out.println(s1);
        //获取集合元素个数
        int size = list.size();
        System.out.println("size = " + size);
        //遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("=============");
        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {        // 逐个输出
            System.out.println(iter.next());
        }
    }
}
