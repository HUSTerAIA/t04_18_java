package com.atguigu.map3;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 统计字符出现次数
 */
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

        HashMap<String,Integer> map=new HashMap<>();        // 1.创建集合map存入字符串，键值对为包装类
        System.out.println("输入字符串：");
        Scanner sc=new Scanner(System.in);
        String data=sc.next();
        //转换
        char[] chars=data.toCharArray();        // 2.整个字符串拆分成单个字符
//遍历
        for(char s:chars){              // 3.遍历
            String key=s+"";        // 重新转换成string
            if(!map.containsKey(key)){      // 4.判断是否有重复key：没有存入key，次数=1
                map.put(key,1);

            }else {
                Integer num=map.get(key);       // 5.有key，取出对应value+1存入
                num++;
                map.put(key,num);
            }
        }
        System.out.println(map);



    }
}
