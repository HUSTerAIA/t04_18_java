package com.atguigu.code_trunk;

public class Person {
    String name;
    //无参构造
    public Person(){
        System.out.println("无参构造");
    }

/*    //有参构造
    public Person(String name){
        this.name=name;
        System.out.println("有参构造");
    }*/

    //构造代码块
    {
        System.out.println("代码块");
    }

    //静态代码块
    static{
        System.out.println("静态代码块");
    }
}
