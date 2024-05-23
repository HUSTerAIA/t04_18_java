package com.atguigu.pack3;

public class Person {
    private String name;    //私有化，仅本类内部使用
    private int age;        // 封装

    /*
    为name提供set/get方法
     */
    public void setName(String name) {
        this.name=name;     // 当前对象赋值形参
    }
    public String getName(){
        //无参有返回值
        return name;
    }

    public void setAge(int age) {
        if(age<0||age>150){
            System.out.println("不合理");
        }else{
            this.age=age;
        }
    }

    public int getAge(){
        return age;
    }

}
