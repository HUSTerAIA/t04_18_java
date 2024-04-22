package com.atguigu.extends6;

public class Zi {
    int num=10;
    public Zi(){
        this(1000);     //调用成员方法
        System.out.println("无参构造");
    }
    public Zi(int a){

        System.out.println("有参构造"+a);
    }

    public void method(){
        int num=100;
        System.out.println(num);    //就近原则
        System.out.println(this.num);       //调用成员变量
        System.out.println("方法");
    }

    public void method1(int b){
        this.method();  //调用成员方法
        System.out.println("方法1"+b);
    }
}
