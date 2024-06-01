package com.atguigu.map1;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Map3 {
    public static void main(String[] args) {
        LinkedHashMap<String, String> map1 = new LinkedHashMap<>();     // 集合map
        map1.put("1", "a");
        map1.put("2", "b");
        map1.put("3", "c");
        System.out.println(map1);
    }
}
