package com.atguigu.lists1;

import java.util.ArrayList;

public class Lists1 {
    public static void main(String[] args) {
        /*
        list嵌套list
         */
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");

        ArrayList<String> list1=new ArrayList<>();
        list1.add("C");
        list1.add("D");

        ArrayList<ArrayList<String>> list2=new ArrayList<>();
        list2.add(list);
        list2.add(list1);

        for(ArrayList<String> l1:list2){
            for(String s:l1){
                System.out.println(s);
            }
        }
    }
}
