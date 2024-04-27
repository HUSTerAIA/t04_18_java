package com.atguigu.list1;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class List2 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        //删除元素2
        list.remove(Integer.valueOf(2));    //转换成包装类
        System.out.println("list = " + list);
    }
}
