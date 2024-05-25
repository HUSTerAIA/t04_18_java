package com.atguigu.extends7;

public class Employee {
    // 父类，javabean
    private int id;
    private String name;

    public Employee(){
    // 无参构造
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }
}
