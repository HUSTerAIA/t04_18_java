package com.aiguigu.object;

public class Person1 {
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
    public void drink(){
        int water;
//        System.out.println(water);  //未初始化
//        System.out.println(hour);   //sleep()的局部变量，无法使用
    }
}
