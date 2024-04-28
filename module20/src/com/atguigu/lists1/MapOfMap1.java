package com.atguigu.lists1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapOfMap1 {
    public static void main(String[] args) {
        /*
        map嵌套map
                 */
        HashMap<Integer, String> map1 = new HashMap();
        map1.put(1, "a");
        map1.put(2, "b");
        HashMap<Integer, String> map2 = new HashMap<>();
        map2.put(3, "c");
        map2.put(4, "d");

        HashMap<Character, HashMap<Integer, String>> maps1 = new HashMap<>();
        maps1.put('A', map1);
        maps1.put('B', map2);

        Set<Map.Entry<Character, HashMap<Integer, String>>> set = maps1.entrySet();
        System.out.println("set = " + set);
        System.out.println("-----------------------------");
        for (Map.Entry<Character, HashMap<Integer, String>> entry : set) {
            HashMap<Integer, String> hashMap = entry.getValue();
            Set<Integer> set1 = hashMap.keySet();
            System.out.println("set1 = " + set1 + " ");
            for (Integer key : set1) {
//                System.out.println("----------------------");
                System.out.println(hashMap.get(key));
            }
        }

    }
}
