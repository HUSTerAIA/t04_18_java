package com.atguigu.abstract1;

public abstract class Animal {  // 用于类
    private String name;
    private int age;

    public Animal() {

    }

    public abstract void eat();     // 抽象方法

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
