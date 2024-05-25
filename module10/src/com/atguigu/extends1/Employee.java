package com.atguigu.extends1;

public class Employee {
    String name;
    private int age;        // 无法继承私有成员
    String gender;
    public void work(){
        System.out.println("Employee works");
    }

    private void eat(){
        System.out.println("Employee eats");
    }
}
