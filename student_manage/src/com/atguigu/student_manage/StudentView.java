package com.atguigu.student_manage;

import java.util.Scanner;

public class StudentView {

    //成员属性，本类使用
    Scanner sc = new Scanner(System.in);    //键盘录入
    int count = 0;    //学生数目索引
    Student[] students = new Student[50];   //对象数组，一个班级总数，访问非静态成员
//    Student[] newStudents = new Student[students.length-1];     //一次删除一个学生，复制到新数组

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
                    System.out.println("是否退出系统？0（退出）/9（取消）");
                    int key = sc.nextInt();
                    if (key == 0) {
                        System.out.println("成功退出");
                        return; //结束方法
                    } else {
                        break;  //
                    }

            }


        }
    }

    private void findStudent() {
        System.out.println("学号" + "\t" + "姓名" + "\t" + "年龄" + "\t" + "性别");
        /*
        1.冒泡排序
        2.显示所有学生
         */
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - 1 - j; j++) {
                if (students[j].getId() > students[j + 1].getId()) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }

        if (count == 0) {
            System.out.println("当前班级无学生，请添加");
        } else {

            for (int k = 0; k < count; k++) {
                System.out.println(students[k].getId() + "\t" + students[k].getName() + "\t" + students[k].getAge() + "\t" + students[k].getGender());
            }

        }


    }

    private void modifyStudent() {
        /*
            1.键盘录入要修改的学生学号；
            2.查找该学生在数组的位置；
            3.录入修改信息；
            4.按照原位置修改；
         */
        System.out.println("学生学号：");
        int id = sc.nextInt();
        int index = ArrayUtils.findIndex(students, count, id);
        System.out.println("学生姓名：");
        String name = sc.next();
        System.out.println("学生年龄：");
        int age = sc.nextInt();
        System.out.println("学生性别：");
        String gender = sc.next();
        Student student = new Student(id, name, age, gender);
        students[index] = student;
        System.out.println("修改成功");
    }

    private void deleteStudent() {
        /*
        1.录入学号；
        2.查找索引；
        3.复制索引前后到temp；
        4.students更新；
         */
        System.out.println("学号：");
        int id = sc.nextInt();
        int index = ArrayUtils.findIndex(students, count, id);
        Student[] tempStudents = new Student[students.length - 1];
        System.arraycopy(students, 0, tempStudents, 0, index);  //index前
        System.arraycopy(students, index + 1, tempStudents, index, students.length - index - 1);
        students = tempStudents;
        count--;
        System.out.println("删除成功");

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
        int id = sc.nextInt();
        System.out.println("学生姓名：");
        String name = sc.next();
        System.out.println("学生年龄：");
        int age = sc.nextInt();
        System.out.println("学生性别：");
        String gender = sc.next();
        Student student = new Student(id, name, age, gender);
        students[count] = student;
        count++;
        System.out.println("添加成功");

    }
}
