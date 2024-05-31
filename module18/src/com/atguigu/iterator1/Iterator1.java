package com.atguigu.iterator1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 1.创建数组对象
 * 2.转化成迭代器
 * 3.判断是否有元素
 * 4.返回元素
 */
public class Iterator1 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();       // arraylist
        list.add("A");
        list.add("B");
        list.add("C");

        Iterator<String> it=list.iterator();        // 迭代器对象
        while(it.hasNext()){        // 是否有下一个元素
            String s=it.next();     // 有元素，类型为string
            System.out.println("s = " + s);
        }
    }
}
