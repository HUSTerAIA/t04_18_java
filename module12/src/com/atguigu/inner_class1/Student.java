package com.atguigu.inner_class1;

public class Student {
    //成员变量
    int num=10;
    static String str="static str";
    class A{
        //内部类成员变量
        int num =100;
        public void method(int num){
            System.out.println(num);    //就近原则，内部类局部变量
            System.out.println(this.num);   //内部类成员变量
            System.out.println(Student.this.num);   //外部类成员变量,不是静态，使用this
            System.out.println(Student.str);
        }
    }
}
