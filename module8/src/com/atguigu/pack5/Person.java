package com.atguigu.pack5;

public class Person {
    private String name;    //私有化，仅本类内部使用
    private int age;

    public Person(){
        System.out.println("无参构造");
    }

    public Person(String name, int age){
        // 有参构造
        this.name = name;
        this.age = age;
    }

    /*
    为name提供set/get方法
     */
    public void setName(String name) {
        this.name=name;
    }
    public String getName(){
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
