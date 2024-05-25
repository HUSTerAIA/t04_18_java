package com.atguigu.extends5;

public class Zi extends Fu{
    int num=100;        // 重写

    public Zi(){
        super();    //调用父类无参构造
        System.out.println("子类无参构造");
    }

    public Zi(int a){
        super(10);  //调用父类有参构造
        System.out.println("子类有参构造");
    }

    public void method(){
        System.out.println(num);
        System.out.println(super.num);      // 调用父类成员变量
    }
}
