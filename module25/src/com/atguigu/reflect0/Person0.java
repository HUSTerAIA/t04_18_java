package com.atguigu.reflect0;

public class Person0 {
    private String name;
    private Integer age;

    //自定义私有方法
    private void method(){}

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
