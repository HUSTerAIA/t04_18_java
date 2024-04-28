package com.atguigu.lists1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapInList {
    public static void main(String[] args) {
        /*
        list嵌套map
               */
        //两个map
        HashMap<Integer,String> map1=new HashMap();
        map1.put(1,"a");
        map1.put(2,"b");
        HashMap<Integer,String> map2=new HashMap<>();
        map2.put(3,"c");
        map2.put(4,"d");

        //list套map
        ArrayList<HashMap<Integer,String>> list1=new ArrayList<>();
        list1.add(map1);
        list1.add(map2);

        //遍历
        for(HashMap<Integer,String> listElem:list1){
            Set<Map.Entry<Integer,String>> set= listElem.entrySet();
            for(Map.Entry<Integer,String> entry:set){
                System.out.println(entry.getKey()+":"+entry.getValue());
            }
        }


    }
}
