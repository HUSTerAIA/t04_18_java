package com.atguigu.iterator1;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator1 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        Iterator<String> it=list.iterator();
        while(it.hasNext()){
            String s=it.next();
            System.out.println("s = " + s);
        }
    }
}
