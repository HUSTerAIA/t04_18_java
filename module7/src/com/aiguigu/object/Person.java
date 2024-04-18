package com.aiguigu.object;

public class Person {
    //属性：成员变量->类中方法外
    String name;
    int age=20;

    //行为：成员方法
    public void eat(String food){
        System.out.println("吃"+food);
    }
    public int sleep(){
        int hour=8; //局部变量：方法内部
//        System.out.println("睡"+hour+"h");
        return hour;
    }
}
