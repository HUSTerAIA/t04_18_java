package com.atguigu.design2;

/**
 * 1.构造私有化
 * 2.私有静态自动创建自身对象，类似set
 * 3.公有静态提供自身对象，类似get
 */
public class Singleton1 {
    /*
    饿汉式
     */

    //防止外界随意使用构造方法创建对象，构造私有化
    private Singleton1() {}

    /*
    使得对象随着类的加载而创建；同时防止外界类名调用，将其私有化
     */
    private static Singleton1 singleton1=new Singleton1();

    //将内部自动创建的对象提供给外界
    public static Singleton1 getSingleton(){
        return singleton1;
    }
}
