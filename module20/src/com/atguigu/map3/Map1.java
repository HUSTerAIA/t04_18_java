package com.atguigu.map3;

import java.util.HashMap;
import java.util.Scanner;

public class Map1 {
    public static void main(String[] args) {
        /*
        元素录入存入集合,统计字符串出现次数：
        1.创建map对象
        2.键盘录入
        3.录入数据转成char
        4.遍历判断是否为map集合中的key
        5.不是key，初始化键值对
        6.已经有key，value++
         */

        HashMap<String,Integer> map=new HashMap<>();
        System.out.println("输入字符串：");
        Scanner sc=new Scanner(System.in);
        String data=sc.next();
        //转换
        char[] chars=data.toCharArray();
//遍历
        for(char s:chars){
            String key=s+"";
            if(!map.containsKey(key)){
                map.put(key,1);

            }else {
                Integer num=map.get(key);
                num++;
                map.put(key,num);
            }
        }
        System.out.println(map);



    }
}
