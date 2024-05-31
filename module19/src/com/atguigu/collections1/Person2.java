package com.atguigu.collections1;

public class Person2 implements Comparable<Person2>{        // 1.实现接口
    /*
    标准javabean
     */
    int age;
    String name;

    public Person2() {
    }

    public Person2(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person1{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person2 o) {       // 2.重写抽象方法
        return this.getAge()-o.getAge();
    }
}
