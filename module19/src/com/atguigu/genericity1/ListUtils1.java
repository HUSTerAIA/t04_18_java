package com.atguigu.genericity1;

import java.util.ArrayList;

public class ListUtils1 {
    /*
    定义带泛型的addAll方法
     */
    public static <E> void addAll(ArrayList<E> arr,E...e){      //E...e:可变参数
        for(E element:e){
            arr.add(element);
        }
    }
}
