package com.atguigu.map1;


import java.util.Collection;

import java.util.HashMap;

public class Map1 {
    public static void main(String[] args) {
        /*
        map基本方法
         */
        HashMap<String, String> map1 = new HashMap<>();
        map1.put("1", "a");
        map1.put("2", "b");
        map1.put("3", "c");
        System.out.println(map1);
        //存入键值对，返回被替换的value
        String s = map1.put("1", "A");
        System.out.println(s);
        //根据key删除键值对，返回value
        String s2 = map1.remove("2");
        System.out.println(s2);
        //根据key获取value
        String s3=map1.get("1");
        System.out.println("s3 = " + s3);
        //判断是否含有指定key
        System.out.println(map1.containsKey("3"));
        //获取value，转存到collection
        Collection<String> c1= map1.values();
        System.out.println(c1);

        map1.put(null, null);
        System.out.println("map1 = " + map1);

    }
}
