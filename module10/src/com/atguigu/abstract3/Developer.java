package com.atguigu.abstract3;

public abstract class Developer extends Employee{
    // 继承employee
    public Developer() {
    }

    public Developer(int id, String name) {
        super(id, name);        // 调用父类有参构造
    }
}
