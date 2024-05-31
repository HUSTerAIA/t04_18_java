package com.atguigu.genericity1;

import java.util.ArrayList;

/**
 * 定义包含泛型的方法：参数
 */
public class ListUtils1 {
    /*
    定义带泛型的addAll方法
     */
    public static <E> void addAll(ArrayList<E> arr,E...e){      //E...e:可变参数
        for(E element:e){       // 增强for
            arr.add(element);
        }
    }
}
