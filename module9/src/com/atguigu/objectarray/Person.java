package com.atguigu.objectarray;

public class Person {
    private String name;        // 成员变量私有化
    private int age;        // 封装

    public Person(String name, int age) {
        // 有参构造
        this.name = name;
        this.age = age;
    }
    public Person(){

    }
    public String getName() {           //对外提供公有化接口
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }


}
