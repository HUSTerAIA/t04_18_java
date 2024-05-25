package com.atguigu.interface1;

public interface USB {      // 接口，一个标准
    //抽象方法
    public abstract void open();


    String close(String msg);       // 访问权限为默认空


    //默认方法
    public default void method1(){
        System.out.println("接口默认方法");
    }

    //静态方法
    public static void method2(){
        System.out.println("接口静态方法");           // 无法重写静态对象
    }
}
