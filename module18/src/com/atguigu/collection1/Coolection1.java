package com.atguigu.collection1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Coolection1 {
    public static void main(String[] args) {
        Collection<String> c1=new ArrayList<>();        // collection单列集合顶级接口
        //添加元素
        c1.add("张三");       // 非静态成员
        c1.add("李四");
        c1.add("王五");
        System.out.println(c1);
        //添加全部
        Collection<String> c2=new ArrayList<>();
        c2.add("abc");
        c2.addAll(c1);      // 集合合并
        System.out.println(c2);
        //清除
        c1.clear();
        System.out.println(c1);
        //判断是否包含
        System.out.println(c2.contains("abc"));     // c2是否包含abc
        //判断是否为空
        System.out.println(c1.isEmpty());
        //删除指定元素
        c2.remove("abc");
        System.out.println(c2);
        //集合大小
        int size=c2.size();     // 非静态成员方法
        System.out.println("size = " + size);
        //类型转换
        Object[] arr=c2.toArray();      // 转换成object对象数组
        System.out.println(Arrays.toString(arr));

    }
}
