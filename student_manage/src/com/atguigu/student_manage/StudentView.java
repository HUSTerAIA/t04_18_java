package com.atguigu.student_manage;

import java.util.Scanner;

public class StudentView {

    //成员属性，本类使用
    Scanner sc = new Scanner(System.in);    //键盘录入
    int count=0;    //学生数目索引
    Student[] students = new Student[50];   //对象数组，一个班级总数，访问非静态成员


    /*
    start方法用于展示页面及调用功能
     */

    public void start() {
        while (true) {
            System.out.println("---------------学生管理系统---------------");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查找学生");
            System.out.println("5 退出系统");
            System.out.println("请选择数字1-5");
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    deleteStudent();
                    break;
                case 3:
                    modifyStudent();
                    break;
                case 4:
                    findStudent();
                    break;
                case 5:
                    System.out.println("退出系统");
                    break;
            }


        }
    }

    private void findStudent() {
        System.out.println("查");
    }

    private void modifyStudent() {
        System.out.println("改");
    }

    private void deleteStudent() {
        System.out.println("删");
    }

    private void addStudent() {
        /*
        添加学生:
        1.键盘录入信息
        2.学生信息封装进入Student对象；
        3.Student对象存入students数组；
        4.count记录学生总数；
         */
        System.out.println("学生学号：");
        int id=sc.nextInt();
        System.out.println("学生姓名：");
        String name=sc.next();
        System.out.println("学生年龄：");
        int age=sc.nextInt();
        System.out.println("学生性别：");
        String gender=sc.next();
        Student student=new Student(id,name,age,gender);
        students[count]=student;
        count++;
        System.out.println("添加成功");

    }
}
