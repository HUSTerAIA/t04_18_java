package com.atguigu.map1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map2 {
    public static void main(String[] args) {
        //hashmap遍历
        HashMap<String, String> map1 = new HashMap<>();     // 集合map键值对泛型都是string
        map1.put("1", "a");
        map1.put("2", "b");
        map1.put("3", "c");
        System.out.println(map1);

        /*
       两种遍历元素的方式
         */
//获取key集合
        Set<String> set= map1.keySet();     // 存入string单列集合set
        for (String key:set){       // 增强for
            System.out.println(key+":"+map1.get(key));      // 获取key对应的value
        }
        System.out.println("================");
        //获取键值对
        Set<Map.Entry<String,String>> entry1=map1.entrySet();       // 双列集合map的键值对组成单列集合collection的set
        for(Map.Entry entryEle:entry1){
            System.out.println(entryEle.getKey()+":"+entryEle.getValue());
        }
    }
}
