package com.atguigu.genericity3;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        /*
        泛型通配符
         */

        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");

        ArrayList<Integer> list1= new ArrayList<>();
        list1.add(1);
        list1.add(2);

        method(list);
        method(list1);
    }

    public static void method(ArrayList<?> arr){        // 通配符：未指定泛型类型
        for(Object o:arr){
            System.out.println(o);
        }
    }
}
