package com.atguigu.reflect2;

public class Person0 {
    private String name;
    private Integer age;

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

    private void eat(){     // 私有
        System.out.println("吃饭");
    }
}
