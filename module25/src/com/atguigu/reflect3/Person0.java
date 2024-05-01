package com.atguigu.reflect3;

public class Person0 {
    private String name;
    private Integer age;
    public  Double salary;

    //自定义私有构造
    private Person0(String name){
        this.name = name;
    }

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

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    private void eat(){
        System.out.println("吃饭");
    }
}
