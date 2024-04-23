package com.atguigu.interface3;

public class InterfaceImpl implements Interface1,Interface2{
    public void method(){   //重写一次重名抽象类
        System.out.println("重写");
    }

    @Override
    public void method1() {
        System.out.println("重写默认方法");
    }
}
