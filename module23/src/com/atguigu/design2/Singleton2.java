package com.atguigu.design2;

public class Singleton2 {
    /*
    懒汉式
     */

    //防止外界随意使用构造方法创建对象，构造私有化
    private Singleton2() {}

    /*
    防止外界类名调用，将其私有化
     */
    private static Singleton2 singleton2=null;

    //将内部创建的对象提供给外界
    public static Singleton2 getSingleton(){
        //解决线程安全问题，加锁
        if(singleton2==null){
            synchronized (Singleton2.class){
                if(singleton2==null){
                    singleton2=new Singleton2();
                }
                return singleton2;
            }
        }

        return singleton2;
    }
}
