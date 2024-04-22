package com.atguigu.extends7;

public class Test {
    public static void main(String[] args) {
        Teacher t=new Teacher();
        t.setId(10);
        t.setName("张三");
        System.out.println(t.getId()+t.getName());

        Manager m=new Manager();
        System.out.println(m.getId()+m.getName());

    }
}
