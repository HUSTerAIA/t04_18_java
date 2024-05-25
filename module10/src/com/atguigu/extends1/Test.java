package com.atguigu.extends1;

public class Test {
    public static void main(String[] args) {
        Teacher t=new Teacher();
        t.name="张三";
        System.out.println(t.name+"..."+t.gender);      // 继承非私有成员
        t.work();
    }
}
