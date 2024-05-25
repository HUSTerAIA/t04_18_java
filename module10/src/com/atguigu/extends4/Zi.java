package com.atguigu.extends4;

public class Zi extends Fu{
    public Zi(){
//        super();  //默认存在，调用父类无参构造
        System.out.println("子类无参构造");
    }

    public Zi(int a){
        System.out.println("子类有参构造");
    }
}
