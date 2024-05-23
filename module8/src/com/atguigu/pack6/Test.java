package com.atguigu.pack6;

public class Test {
    public static void main(String[] args) {
        //无参构造
        Student s1 = new Student();     // 调用无参构造
        s1.setName("小明");
        s1.setId(1);
        System.out.println(s1.getName()+"..."+s1.getId());
        //有参构造
        Student s2 = new Student("小红",2);       // 调用有参构造
        System.out.println(s2.getName()+"..."+s2.getId());
    }
}
