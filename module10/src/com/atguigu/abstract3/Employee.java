package com.atguigu.abstract3;

public abstract class Employee {
    // 父类，javabean，抽象类
    private int id;
    private String name;

    public Employee() {
    }

    public Employee(int id, String name) {
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract void work();    // 抽象方法

}
