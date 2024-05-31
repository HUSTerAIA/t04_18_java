package com.atguigu.genericity3;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 泛型通配符
 */
public class Test2 {
    public static void main(String[] args) {
        /*
        泛型上下限
         */
//Integer->Number->Object基类
        //String->Object

        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<Number> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Object> list4 = new ArrayList<>();


//        method1(list1); //无关
        method1(list2); //本类
        method1(list3); //子类
//        method1(list4); //父类


//        method2(list1);//无关
        method2(list2);//本类
//        method2(list3);//子类
        method2(list4);//父类

    }

    //本类及子类
    public static void method1(Collection<? extends Number> collection) {

    }

    //本类及父类
    public static void method2(Collection<? super Number> collection) {
    }
}
