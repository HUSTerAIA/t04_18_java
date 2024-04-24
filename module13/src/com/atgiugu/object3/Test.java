package com.atgiugu.object3;

public class Test {
    public static void main(String[] args) {
        //将学生按照分数排序
        Student[] students=new Student[3];
        Student s1=new Student("a",100);
        Student s2=new Student("b",70);
        Student s3=new Student("c",80);
        //存入对象数组
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;

        //冒泡排序

        for(int i=0;i<students.length-1;i++){
            for (int j=0;j<students.length-1-i;j++){
                if(students[j].compareTo(students[j+1])>0){
                    Student temp =students[j];
                    students[j]=students[j+1];
                    students[j+1]=temp;
                }
            }
        }

        //输出
        for(int k=0;k<students.length;k++){
            System.out.println(students[k]);
        }

    }
}
