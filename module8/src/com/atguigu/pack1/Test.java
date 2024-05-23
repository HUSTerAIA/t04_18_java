package com.atguigu.pack1;

public class Test {
    public static void main(String[] args) {
        Person person=  new Person();
        person.setName("张三");       //外部调用public方法修改private变量
        String name=person.getName();
        System.out.println(name);
    }
}
