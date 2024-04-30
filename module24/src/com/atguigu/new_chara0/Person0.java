package com.atguigu.new_chara0;

public class Person0 {
    private String name;
    private Integer age;

    public Person0() {
    }

    public Person0(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person0{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
