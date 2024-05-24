package com.atguigu.static1;

public class Test {
    public static void main(String[] args) {
        Student.classRoom=111;      // 访问静态成员变量

        Student s1=new Student();
        s1.name="张三";
        s1.age=18;
        System.out.println(s1.name+"..."+s1.age+"..."+ Student.classRoom);
        Student s2=new Student();


        s2.name="李四";
        s2.age=19;
        System.out.println(s2.name+"..."+s2.age+"..."+ Student.classRoom);

        Student.classRoom=222;
        System.out.println(s2.name+"..."+s2.age+"..."+ Student.classRoom);

    }
}
