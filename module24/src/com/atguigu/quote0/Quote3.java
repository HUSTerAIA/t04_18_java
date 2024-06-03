package com.atguigu.quote0;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.function.Function;

/**
 * 引用构造方法
 * 1.重写方法apply形参string,返回值person1
 * 2.引用方法new构造：形参string，返回值person1
 */
public class Quote3 {
    public static void main(String[] args) {

        /*
        引用构造方法
         */
        //赋予名字

        method(new Function<String, Person1>() {
            @Override
            public Person1 apply(String s) {
                return new Person1(s);
            }
        },"abc");

        System.out.println("------------lambda------------");
        method( s ->            // 一个方法参数
                 new Person1(s)     // 方法体一句话

        ,"abc");

        System.out.println("------------方法引用------------");
        /*
        apply为重写方法：参数String，返回Person1
        new Person1():参数 String，返回Person1
         */
        method(
                  Person1::new

        ,"abc");

    }



    public static void method(Function<String,Person1>function,String name){
        Person1 p1=function.apply(name);
        System.out.println(p1);

    }
}
