package com.atguigu.map1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map2 {
    public static void main(String[] args) {
        //hashmap遍历
        HashMap<String, String> map1 = new HashMap<>();
        map1.put("1", "a");
        map1.put("2", "b");
        map1.put("3", "c");
        System.out.println(map1);
//获取key集合
        Set<String> set= map1.keySet();
        for (String key:set){
            System.out.println(key+":"+map1.get(key));
        }
        System.out.println("================");
        //获取键值对
        Set<Map.Entry<String,String>> entry1=map1.entrySet();
        for(Map.Entry entryEle:entry1){
            System.out.println(entryEle.getKey()+":"+entryEle.getValue());
        }
    }
}
